package test;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("configure/hibenate.cfg.xml");
        cfg.addAnnotatedClass(Student.class);
        SessionFactory sf=cfg.buildSessionFactory();

        Session ses=sf.openSession();
        ses.beginTransaction();
        Student s=new Student();
        s.setName("SHreyash Gurav");
        s.setClassName("Second Year");
        s.setRoll(36);
        s.setMark(65);

        ses.save(s);

        ses.getTransaction().commit();
        System.out.println("Data Saved Successfully!!!");
        ses.close();
        sf.close();
    }
}
