package com.klu;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
  private static SessionFactory sessionFactory;
  public static SessionFactory getSessionFactory(){
    if (sessionFactory==null) {
      Properties props = new Properties();
      props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
      props.put(Environment.URL, "jdbc:mysql://localhost:3306/jfsd_s24");
      props.put(Environment.USER, "root");
      props.put(Environment.PASS, "Geetu@29kl");
      props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
      props.put(Environment.HBM2DDL_AUTO, "update");
      props.put(Environment.SHOW_SQL, true);
      props.put(Environment.FORMAT_SQL, true);
      
      Configuration configuration=new Configuration();
      configuration.addProperties(props);
      
      //add our entity class to the configuration object
      configuration.addAnnotatedClass(Student.class);
      configuration.addAnnotatedClass(Employee.class);
      
      
      ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
      sessionFactory = configuration.buildSessionFactory(registry);
      
    }
    return sessionFactory;
  }

}