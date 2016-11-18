package com.yb.service;

import com.yb.domain.Flight;

import java.util.List;

/**
 * Created by 杨波 on 2016/11/16.
 */
public interface IFlightService {
    List<Flight> findAll();

    void add(Flight flight);

    Flight findById(Integer id);

    void update(Flight flight);


    void delete(Integer id);

    List<Flight> findByNumberAndDate(String number, String date);
}
