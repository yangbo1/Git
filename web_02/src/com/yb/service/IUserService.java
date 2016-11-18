package com.yb.service;

import com.yb.domain.User;

/**
 * Created by 杨波 on 2016/11/10.
 */
public interface IUserService {
    void addUser(User user);

    User  findByUsername(String username);
}
