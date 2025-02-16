package test;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import entity.Student;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("configure/hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student.class);

        SessionFactory sf=cfg.buildSessionFactory();
        Session ses=sf.openSession();
        ses.beginTransaction();
        String query="from Student";
        Query<Student> q=ses.createQuery(query,Student.class);
        List<Student> list=q.list();
        for(Student s:list){
            System.out.println(s);
        }

        ses.getTransaction().commit();

    }
}
