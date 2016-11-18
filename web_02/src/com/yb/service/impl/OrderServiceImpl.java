package com.yb.service.impl;

import com.yb.dao.IOrderDao;
import com.yb.dao.impl.OrderDaoImpl;
import com.yb.domain.Order;
import com.yb.service.IOrderService;
import com.yb.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by 杨波 on 2016/11/11.
 */
public class OrderServiceImpl implements IOrderService {
    IOrderDao orderDao = new OrderDaoImpl();

    @Override
    public void addOrder(Order order) {
        Session session = HibernateUtils.getSession();
        Transaction tr = session.beginTransaction();
        try {
            orderDao.save(order);
            HibernateUtils.commit(tr);
        } catch (Exception e) {
            HibernateUtils.rollback(tr);
        }
    }

    @Override
    public List<Order> findByUsername(String username) {
        List<Order> result=null;
        Session session = HibernateUtils.getSession();
        Transaction tr = session.beginTransaction();
        try {
            result= orderDao.findByUsername(username);
            HibernateUtils.commit(tr);
        } catch (Exception e) {
            HibernateUtils.rollback(tr);
        }
        return result;
    }
}
