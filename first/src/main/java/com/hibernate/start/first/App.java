package com.hibernate.start.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started:..........." );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        //creating address of object class
        Student student=new Student();
        student.setId(122);
        student.setName("Prince S Barsagade");
        student.setCity("Gondia City");
        System.out.println(student);
        // creating object of address class
        
        Session session= factory.openSession();
          
        Transaction tx=session.beginTransaction();
        session.save(student);
        tx.commit();
        session.close();
        
    }
}
 