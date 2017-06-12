package com.zll.practice.web;

import com.zll.practice.domain.User;
import com.zll.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

/**
 * Created by zliang on 17-6-4.
 */

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(){
        return "Hello World!!!!!";
    }

    @RequestMapping("/save")
    public String SynMessage(){
        User u = new User();
        u.setUsername("zhangll");
        u.setPassword("123");
        User user = userService.createUser(u);
        System.out.println(user);
        return "Save Success!!";
    }

    @RequestMapping("/asyn")
    Callable<String> processUpload() {

        return new Callable<String>() {
            public String call() throws Exception {
                Thread.sleep(2000);
                return "Asyn Message.";
            }
        };
    }


}
