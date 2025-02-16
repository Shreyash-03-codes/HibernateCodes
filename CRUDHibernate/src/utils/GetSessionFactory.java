package utils;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import entity.Songs;
public class GetSessionFactory {

    private static SessionFactory sessionFactory=null;

    public static SessionFactory getSessionFactory(){


        if(sessionFactory==null){
            Configuration cfg=new Configuration();
            cfg.configure("configure/hibernate.cfg.xml");
            cfg.addAnnotatedClass(Songs.class);
            sessionFactory=cfg.buildSessionFactory();
        }

        return sessionFactory;
    }
}
