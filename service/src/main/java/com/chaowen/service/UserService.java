package com.chaowen.service;


import com.chaowen.model.User;

public interface UserService {
    /**
     * 新增用户
     * @param user
     * @return
     */
    int add(User user);

    /**
     * 查询用户
     * @return
     */
    User login(User user);


}
