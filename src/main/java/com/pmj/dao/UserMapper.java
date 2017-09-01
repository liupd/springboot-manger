package com.pmj.dao;

import com.pmj.model.User;

/**
 * Created by piaomingjie on 2017/8/23.
 */
public interface UserMapper {
    User findByUserName(String name);
}
