package com.yb.service;

import com.yb.domain.Order;

import java.util.List;

/**
 * Created by 杨波 on 2016/11/11.
 */
public interface IOrderService {
    void addOrder(Order order);

    List<Order> findByUsername(String username);
}
