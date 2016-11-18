package com.yb.dao;

import com.yb.domain.Order;

import java.util.List;

/**
 * Created by 杨波 on 2016/11/11.
 */
public interface IOrderDao {
    void save(Order order);

    List<Order> findByUsername(String username);
}
