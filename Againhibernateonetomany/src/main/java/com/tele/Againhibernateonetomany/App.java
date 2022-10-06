package com.tele.Againhibernateonetomany;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con= new Configuration().configure().addAnnotatedClass(Trainer.class);
    	Configuration con1= new Configuration().configure().addAnnotatedClass(Courses.class);
    	SessionFactory ss= con.buildSessionFactory();
    	Session session=ss.openSession();
    	Transaction t= session.beginTransaction();
    	//different courses
        Courses C1= new Courses();
    	C1.setCourse_Id(101);
    	C1.setCourse_Name("Angular");
    	
    	Courses C2= new Courses();
    	C2.setCourse_Id(102);
    	C2.setCourse_Name("Java");
    	
    	Courses C3= new Courses();
    	C3.setCourse_Id(103);
    	C3.setCourse_Name("Python");
    	
    	Courses C4= new Courses();
    	C4.setCourse_Id(104);
    	C4.setCourse_Name("HTML");
    	
    	// trainer Object
    	Trainer T1= new Trainer();
    	T1.setTeacher_Id(101);
    	T1.setTeacher_Name("Mrudula");
    	
    	Trainer T2= new Trainer();
    	T2.setTeacher_Id(102);
    	T2.setTeacher_Name("Khusbhu");
    	
    	//different courses offered by one trainer
    	T1.getCourses().add(C1);
    	T1.getCourses().add(C2);
    	T2.getCourses().add(C3);
    	T2.getCourses().add(C4);
        session.persist(ss);
    	
    /*    update operation
        Trainer T=(Trainer)session.get(Trainer.class,101);
        T.setTeacher_Name("Mridula Sharma");
        System.out.println("Update Successfully");
        session.getTransaction().commit();*/
        
     /*   delete operation
        Trainer Tt=(Trainer)session.get(Trainer.class, 102);
        session.delete(Tt);
        System.out.println("Delete Successfully");
        session.getTransaction().commit(); */
        
    	t.commit();
    	session.close();
    	
    	
        System.out.println( "Hello World!" );
        
    }
}
