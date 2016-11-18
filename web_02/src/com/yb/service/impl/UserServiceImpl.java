package com.yb.service.impl;

import com.yb.dao.IUserDao;
import com.yb.dao.impl.UserDaoImpl;
import com.yb.domain.User;
import com.yb.service.IUserService;
import com.yb.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by 杨波 on 2016/11/10.
 */
public class UserServiceImpl implements IUserService {
    IUserDao userDao=new UserDaoImpl();
    @Override
    public void addUser(User user) {
        Session session= HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        try{
            userDao.save(user);
            HibernateUtils.commit(tr);
        }catch (Exception e){
            HibernateUtils.rollback(tr);
        }
    }

    @Override
    public User findByUsername(String username) {
        User users=null;
        Session session= HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        try{
            users= userDao.findByUsername(username);
            HibernateUtils.commit(tr);
        }catch (Exception e){
            HibernateUtils.rollback(tr);
        }
        return users;
    }
}
