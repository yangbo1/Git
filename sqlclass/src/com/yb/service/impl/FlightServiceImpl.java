package com.yb.service.impl;

import com.yb.dao.IFlightDao;
import com.yb.dao.impl.FlightDaoImpl;
import com.yb.domain.Flight;
import com.yb.service.IFlightService;
import com.yb.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by 杨波 on 2016/11/16.
 */
public class FlightServiceImpl implements IFlightService {
    IFlightDao flightDao=new FlightDaoImpl();
    List<Flight> flightList=null;
    @Override
    public List<Flight> findAll() {
        Session session= HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        try{
            flightList=flightDao.findAll();
            HibernateUtils.commit(tr);
        }catch (Exception e){
            HibernateUtils.rollback(tr);
        }
        return flightList;
    }

    @Override
    public void add(Flight flight) {
        Session session= HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        try{
            flightDao.add(flight);
            HibernateUtils.commit(tr);
        }catch (Exception e){
            HibernateUtils.rollback(tr);
        }
    }

    @Override
    public Flight findById(Integer id) {
        Flight f=null;
        Session session= HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        try{
            f=flightDao.findById(id);
            HibernateUtils.commit(tr);
        }catch (Exception e){
            HibernateUtils.rollback(tr);
        }
        return f;
    }


    @Override
    public void update(Flight flight) {
        Session session= HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        try{
            flightDao.update(flight);
            HibernateUtils.commit(tr);
        }catch (Exception e){
            HibernateUtils.rollback(tr);
        }
    }

    @Override
    public void delete(Integer id) {
        Session session= HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        try{
            flightDao.delete(id);
            HibernateUtils.commit(tr);
        }catch (Exception e){
            HibernateUtils.rollback(tr);
        }
    }

    @Override
    public List<Flight> findByNumberAndDate(String number, String date) {
        List<Flight> f=null;
        Session session= HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        try{
            f=flightDao.findByNumberAndDate(number,date);
            HibernateUtils.commit(tr);
        }catch (Exception e){
            HibernateUtils.rollback(tr);
        }
        return f;
    }
}
