package com.edubridge.manytomanymapping;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
	    System.out.println("2222222222222222222222222222");
	    cfg.configure("Hibernate.cfg.xml");//populates the data of the configuration file  
	    System.out.println("3333333333333333333333333333");
	    //creating session factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	    System.out.println("4444444444444444444444444");
	    //creating session object  
	    Session session=factory.openSession();  
	    System.out.println("5555555555555555555555555");
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	    
	    Answer answer1=new Answer();
	    answer1.setAnswername("Java is a Programming Language");
	    answer1.setPostedBy("Ravi Malik");
	    
	    Answer answer2=new Answer();
	    answer2.setAnswername("Java is a Platform");
	    answer2.setPostedBy("Sudhir Kumar");
	    
	    Question question1=new Question();
	    question1.setQname("What is Java?");
	    ArrayList<Answer> list1=new ArrayList<Answer>();
	    list1.add(answer1);
	    list1.add(answer2);
	    question1.setAnswers(list1);
	    
	    Answer answer3=new Answer();
	    answer3.setAnswername("Servlet ia an Interface");
	    answer3.setPostedBy("Jai Kumar");
	    
	    Answer answer4=new Answer();
	    answer4.setAnswername("Java is an API");
	    answer4.setPostedBy("Arun");
	    
	    Question question2=new Question();
	    question2.setQname("What is Servlet?");
	    ArrayList<Answer> list2=new ArrayList<Answer>();
	    list2.add(answer3);
	    list2.add(answer4);
	    question2.setAnswers(list2);
	    
	    session.persist(question1);
	    session.persist(question2);
	    t.commit();
	    session.close();
	    System.out.println("Success");
	    
	    
	    
	    
	    
	    
	    

	}

}
