package cn.gcsp.services;

import cn.gcsp.IDAO.IUserDao;
import cn.gcsp.controller.UserController;
import cn.gcsp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    //@Resource //先按照名称装配，如果未找到，则按类型装配

    @Autowired  //按照类型装配，那么要求接口只有一个实现类
    //@Qualifier("iUserDao") //按照名称装配，本程序使用mybatis生成代理DAO实现类，所以不使用@Qualifier("iUserDao")
    IUserDao iUserDao;

    //下面两行代码没有意义，是为了验证“父容器中的bean不能依赖子容器中的bean”
    // 因为SpringMVC 的IOC容器集成自Spring的IOC容器，父容器中的bean不能依赖子容器中的bean，
    //会报org.springframework.beans.factory.NoSuchBeanDefinitionException
    /*
    @Resource
    UserController userController;
    */
    public String queryUSer(User user){
        User u = iUserDao.getUserByNameAndPassword(user);
        if(null != u) {
            System.out.println(u.getName());
            return u.getName();
        }
        return "";

    }
}
