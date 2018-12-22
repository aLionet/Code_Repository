package com.lionet.controller;

import com.lionet.domain.User;
import com.lionet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * @author Lionet
 * @date 2018/12/20 18:41
 */
@Controller
public class UserController {
    @Autowired
    IUserService userService;
    @RequestMapping("/testSpringMVC")
    public String testSpringMVC(){
        List<User> users = userService.findUser();
        for(User user: users){
            System.out.println(user);
        }
        System.out.println("SpringMVC被调用了......");
        return "testSpringMVC";
    }
}
