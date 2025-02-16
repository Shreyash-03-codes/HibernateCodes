package test;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import entity.Books;
import org.hibernate.query.Query;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("configure/hibernate.cfg.xml");
        cfg.addAnnotatedClass(Books.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session ses=sf.openSession();

        ses.beginTransaction();

        String query="delete from Books where bookId=:bi";

        Query q=ses.createQuery(query);
        q.setParameter("bi",5);
       int rs=q.executeUpdate();

        System.out.println(rs);



        ses.getTransaction().commit();
        System.out.println("Data Deleted Successfully!!!!");
        sf.close();
        ses.close();
    }

}
