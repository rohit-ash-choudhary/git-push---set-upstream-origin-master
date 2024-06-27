package com.sp.hibernate.HibernateImplementUsingXML;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sp.hibernate.Beans.Account;

public class App {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAccountnumner(8);
        acc.setFirst_name("Rohit");
        acc.setLast_name("ChoudharY");
        acc.setAccount_balance(100);
        acc.setCity("Delhi");

        Configuration cfg = new Configuration();
        cfg.configure("/com/sp/hibernate/resources/hibernate.cfg.xml"); // Path to hibernate.cfg.xml

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.save(acc); //hiberanate generate the sql query
            System.out.println("Account saved successfully");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
