package com.yb.dao.impl;

import com.yb.dao.IBookDao;
import com.yb.domain.Book;
import com.yb.util.HibernateUtils;
import org.hibernate.Session;

/**
 * Created by 杨波 on 2016/11/10.
 */
public class BookDaoImpl implements IBookDao {
    @Override
    public void save(Book book) {
        Session session= HibernateUtils.getSession();
        session.save(book);
}
}
