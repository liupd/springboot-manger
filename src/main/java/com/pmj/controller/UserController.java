package com.pmj.controller;

import com.pmj.model.User;
import com.pmj.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by piaomingjie on 2017/8/23.
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("getUser")
    public User getUser(String name){
        return  userService.findByUserName(name);
    }
}
