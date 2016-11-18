package com.yb.dao.impl;

import com.yb.dao.IFlightDao;
import com.yb.domain.Flight;
import com.yb.utils.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by 杨波 on 2016/11/16.
 */
public class FlightDaoImpl implements IFlightDao {
    @Override
    public List<Flight> findAll() {
        Session session= HibernateUtils.getSession();
        String hql="from Flight f";
        Query query=session.createQuery(hql);
        return query.list();
    }

    @Override
    public void add(Flight flight) {
        Session session= HibernateUtils.getSession();
        session.save(flight);
    }

    @Override
    public Flight findById(Integer id) {
        Session session = HibernateUtils.getSession();
        return (Flight) session.get(Flight.class, id);
    }

    @Override
    public void update(Flight flight) {
        Session session= HibernateUtils.getSession();
        session.update(flight);
    }

    @Override
    public void delete(Integer id) {
        Session session= HibernateUtils.getSession();
        Flight f= (Flight) session.get(Flight.class,id);
        session.delete(f);
    }

    @Override
    public List<Flight> findByNumberAndDate(String number, String date) {
        Session session= HibernateUtils.getSession();
        String hql="from Flight f where number =? or date=?";
        Query query=session.createQuery(hql);
        query.setParameter(0,number);
        query.setParameter(1,date);
        return query.list();
    }
}
