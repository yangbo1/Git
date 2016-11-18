package com.yb.dao.impl;

import com.yb.dao.IUserDao;
import com.yb.domain.User;
import com.yb.util.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Created by 杨波 on 2016/11/10.
 */
public class UserDaoImpl implements IUserDao {
    @Override
    public void save(User user) {
        Session session= HibernateUtils.getSession();
        session.save(user);
    }

    @Override
    public User findByUsername(String username) {
        Session session=HibernateUtils.getSession();
        return (User) session.get(User.class,username);

    }
}
