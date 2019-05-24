package cn.gcsp.controller;

import cn.gcsp.entity.User;
import cn.gcsp.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping(value="/logon", method = RequestMethod.POST)
    @ResponseBody
    private String logon(User user){
        System.out.println("controller: " + user.getName() + " , " + user.getPassword() );
        String  name = userService.queryUSer(user);
        return name;
    }
}
