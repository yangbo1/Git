package com.yb.dao.impl;

import com.yb.dao.IOrderDao;
import com.yb.domain.Order;
import com.yb.util.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by 杨波 on 2016/11/11.
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public void save(Order order) {
        Session session= HibernateUtils.getSession();
        session.save(order);
    }

    @Override
    public List<Order> findByUsername(String username) {
        Session session=HibernateUtils.getSession();
        String hql="from Order o where username=?";
        Query query=session.createQuery(hql);
        query.setParameter(0,username);
        return query.list();
    }
}
