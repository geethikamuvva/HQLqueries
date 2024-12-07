package com.klu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
//        Configuration configuration = new Configuration();
//        configuration.configure();
        SessionFactory factory = HibernateUtil.getSessionFactory();
        System.out.println(factory);
        
        //Session object retrieving
        Session session = factory.openSession();
        
        Student s = new Student();   //transient state
        //insert data into student pojo
        s.setSname("Shyam");
        s.setEmail("shyam@gmail.com");
        s.setAddress("Guntur");
        
        //begin the transaction using session
        Transaction tx = session.beginTransaction();
        
        //inserting pojo into db
        session.save(s);   //persistent state
        
        //commit the transaction
        tx.commit();
        
        //close session and sessionfactory objects
        session.close();
        factory.close();
    }
}