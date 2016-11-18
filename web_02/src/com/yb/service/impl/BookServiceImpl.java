package com.yb.service.impl;

import com.yb.dao.IBookDao;
import com.yb.dao.impl.BookDaoImpl;
import com.yb.domain.Book;
import com.yb.service.IBookService;
import com.yb.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by 杨波 on 2016/11/10.
 */
public class BookServiceImpl implements IBookService {
    IBookDao bookDao=new BookDaoImpl();
    @Override
    public void addBook(Book book) {
        Session session= HibernateUtils.getSession();
        Transaction tr=session.beginTransaction();
        try{
            bookDao.save(book);
            HibernateUtils.commit(tr);
        }catch (Exception e){
            HibernateUtils.rollback(tr);
        }
    }
    }

