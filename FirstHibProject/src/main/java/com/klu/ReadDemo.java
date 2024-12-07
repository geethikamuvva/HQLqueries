package com.klu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ReadDemo {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s =sf.openSession();
		Student st = s.get(Student.class, 3);
		
		if(st != null) {
			System.out.println("Data using get:" +st);
		}else {
			System.out.println("Record not found");
			
			//read operation done by load() method
			try {
			    Student st1 = s.load(Student.class, 3);
			    System.out.println("Data using load:" + st1);
			}catch(Exception e) {
				System.out.println("Record not found due to:" +e.getMessage());
			}
			
			
			s.close();
			sf.close();
		}
	}
}
