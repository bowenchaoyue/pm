package com.chaowen.service.impl;


import com.chaowen.dao.UserMapper;
import com.chaowen.model.User;
import com.chaowen.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    /**
     * 新增用户
     * @param user
     * @return
     */
    public int add(User user) {
        return userMapper.add(user);
    }

    public User login(User user) {
        return userMapper.query(user);
    }


}
