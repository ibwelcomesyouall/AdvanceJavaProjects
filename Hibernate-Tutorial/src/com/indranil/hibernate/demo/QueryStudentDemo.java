package com.indranil.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.indranil.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// start a transaction
			session.beginTransaction();
			
			// query student
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			// display the students
			displayStudents(theStudents);
			
			// query students : lastName='Banerjee'
			
			theStudents = session.createQuery("from Student s where s.lastName='Banerjee'").getResultList();
			
			// display the students
			System.out.println("\n\nStudents with lastName as 'Banerjee'");
			displayStudents(theStudents);
			
			// query students : lastName='Banerjee' OR fistName='Twinkle'
			
			theStudents = session.createQuery("from Student s where s.lastName='Banerjee'"
											+" OR s.firstName='Twinkle'").getResultList();
						
			// display the students
			System.out.println("\n\nStudents with lastName as 'Banerjee' or fistName as 'Twinkle'");
			displayStudents(theStudents);
			
			// query students : email LIKE '%gmail.com'
			
			theStudents = session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();
									
			// display the students
			System.out.println("\n\nStudents with email id ends with gmail.com");
			displayStudents(theStudents);
			
			// query students : email LIKE '%yahoo.com'
			
			theStudents = session.createQuery("from Student s where s.email LIKE '%yahoo.com'").getResultList();
												
			// display the students
			System.out.println("\n\nStudents with email id ends with yahoo.com");
			displayStudents(theStudents);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		// display the student
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
