package com.yb.utils;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 * Created by 杨波 on 2016/10/22.
 */
public class HibernateUtils {
    //项目中只初始化一次
    private static SessionFactory sf;
    //加载hibernateUtils只初始化一次
    static {
        Configuration configuration=new Configuration();
        configuration.configure();
        sf=configuration.buildSessionFactory();
    }

    //获取Session
    public   static Session getSession(){
        Session session=null;
        if(sf!=null){
            session=sf.getCurrentSession();
        }
        return session;
    }

    //事物提交
    public static void commit(Transaction tr){
            if(tr!=null&&!tr.wasCommitted()){
                tr.commit();
            }
    }
    //事物回滚
    public static void rollback(Transaction tr){
        if(tr!=null&&!tr.wasRolledBack()){
            tr.rollback();
        }
    }
}
