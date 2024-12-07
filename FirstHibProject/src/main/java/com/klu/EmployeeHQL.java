package com.klu;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class EmployeeHQL {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
	    // get session object
	    Session session = sf.openSession();
	    /*
	     * //get query object to get all the records from the table Query<Employee> q =
	     * session.createQuery("from Employee"); //get List object List<Employee>
	     * empList = q.list(); //populate employee details using foreach loop
	     * for(Employee e : empList) System.out.println(e);
	     */

	    // get Query object to get specific employees whose salary is 150000
	    /*
	     * Query<Employee> q = session.createQuery("from Employee where empSal = :sal");
	     * //pass the data into named parameter q.setParameter("sal", new
	     * Double(150000)); //execute the query List<Employee> empList = q.list();
	     * 
	     * //populate employee details using foreach loop for(Employee e : empList)
	     * System.out.println(e);
	     */

	    // delete specific rows based on some condition using hql
	    /*
	     * Query<Employee> q =
	     * session.createQuery("delete from Employee as e where e.empSal = :sal");
	     * q.setParameter("sal", 150000.00); Transaction tx =
	     * session.beginTransaction(); int n = q.executeUpdate(); if( n > 0 )
	     * System.out.println(n + " rows deleted"); else
	     * System.out.println("No rows deleted"); tx.commit();
	     */

	    // update specific columns of sepcific rows using hql
	    /*
	     * Query<Employee> q = session.
	     * createQuery("update Employee e set e.empSal = :sal where e.empDesig = :desig"
	     * ); q.setParameter("sal", 220000.00); q.setParameter("desig", "Professor");
	     * Transaction tx = session.beginTransaction(); int n = q.executeUpdate(); if( n
	     * > 0 ) System.out.println(n + " rows Updated"); else
	     * System.out.println("No rows Updated"); tx.commit();
	     */

	    // getting records using pagination
	    Query<Employee> q = session.createQuery("from Employee");
	    q.setFirstResult(0);
	    q.setMaxResults(3);
	    // get List object
	    List<Employee> empList = q.list();
	    // populate employee details using foreach loop
	    for (Employee e : empList)
	      System.out.println(e);
	    // close the session
	    session.close();
	    // close the sessionfactory
	    sf.close();

	}

}
