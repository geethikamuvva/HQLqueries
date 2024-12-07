package com.klu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateDeleteDemo {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		//update
		//loading single record which is having primary key value 1
		Student st = s.get(Student.class,1);
		if(st!= null) {
			st.setAddress("Hyderabad");
			//update in the session first
			s.update(st);
			//update in the database
			tx.commit();
	     }else {
	    	 System.out.println("Record not found");
	     }
		
		//delete
		//loading single record which is having primary key value 2
		Student st1 = s.get(Student.class, 2);
		if(st1 != null) {
			//begin the transaction
			tx = s.beginTransaction();
			//object deleted from session
			s.delete(st1);
			//delete the object from db permanently
			tx.commit();
		}else {
			System.out.println("Record not found");
			
			s.close();
			sf.close();
		}
	
     }

}
