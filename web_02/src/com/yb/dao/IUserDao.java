package com.yb.dao;

import com.yb.domain.User;

/**
 * Created by 杨波 on 2016/11/10.
 */
public interface IUserDao {
    void save(User user);

    User findByUsername(String username);
}
