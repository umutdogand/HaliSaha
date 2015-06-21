package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class islemDao {
    public void insert(Object o) {
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sesion.beginTransaction();
            sesion.save(o);
            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Object o) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        sesion.delete(o);
        t.commit();
    }

    public void update(Object o) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        sesion.update(o);
        t.commit();
    }
}
