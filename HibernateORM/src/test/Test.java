package test;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import entity.Users;
public class Test {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("configure/hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session ses=sf.openSession();
        ses.beginTransaction();

        Users user=new Users();
        user.setId(36);
        user.setName("Shreyash Gurav");
        user.setAge(19);
        user.setEmail("Guravshreyash2005@gmail.com");

        ses.save(user);

        ses.getTransaction().commit();
        System.out.println("Data Saved Successfully!!!");

        ses.close();
        sf.close();
    }
}
