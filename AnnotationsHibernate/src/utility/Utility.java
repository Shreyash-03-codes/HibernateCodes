package utility;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
public class Utility {
    public SessionFactory getSessionFactory(){
        Configuration cfg=new Configuration();

        SessionFactory sessionFactory=null;


        cfg.configure("configure/hibernate.cfg.xml");
        sessionFactory=cfg.buildSessionFactory();

        return sessionFactory;
    }
}
