package cn.gcsp.services;

import cn.gcsp.IDAO.IUserDao;
import cn.gcsp.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Resource
    IUserDao IUserDao;
    public String queryUSer(User user){
        User u = IUserDao.getUserByNameAndPassword(user);
        if(null != u) {
            System.out.println(u.getName());
            return u.getName();
        }

        return "";

    }
}
