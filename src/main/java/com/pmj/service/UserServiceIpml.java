package com.pmj.service;

import com.pmj.dao.UserMapper;
import com.pmj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by piaomingjie on 2017/8/23.
 */
@Service
public class UserServiceIpml implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public User findByUserName(String name) {
        System.out.println(userMapper+name);
        return userMapper.findByUserName(name);
    }
}
