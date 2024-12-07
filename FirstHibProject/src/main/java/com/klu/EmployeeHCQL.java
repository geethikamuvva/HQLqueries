package com.klu;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import java.util.List;

public class EmployeeHCQL {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
	    Session session = sf.openSession();
	    
	    /*//retrieve all records from db using HCQL
	    Criteria c = session.createCriteria(Employee.class);
	    List<Employee> empList = c.list();
	    //populate the data
	    for(Employee e : empList)
	      System.out.println(e);*/
	    
	    //retrieve all records in ascending order based on empName column using HCQL
	    /*Criteria c = session.createCriteria(Employee.class);
	    c.addOrder(Order.desc("empName"));
	    List<Employee> empList = c.list();
	    //populate the data
	    for(Employee e : empList)
	      System.out.println(e);
	    */
	    
	    //retrieving all employee records which will have salary > 200000
	    /*Criteria c = session.createCriteria(Employee.class);
	    c.add(Restrictions.gt("empSal", 200000.00));
	    List<Employee> empList = c.list();
	    //populate the data
	    for(Employee e : empList)
	      System.out.println(e);*/
	    
	    //retrieving all employees whose desig starts with 'As%' using HCQL
	    Criteria c = session.createCriteria(Employee.class);
	    c.add(Restrictions.ilike("empDesig", "As%"));
	    List<Employee> empList = c.list();
	    //populate the data
	    for(Employee e : empList)
	      System.out.println(e);
	    
	    
	    session.close();
	    sf.close();
	}

}
