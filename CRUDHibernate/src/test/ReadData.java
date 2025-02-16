package test;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entity.Songs;
import utils.GetSessionFactory;
public class ReadData {
    public static void main(String[] args) {

        SessionFactory sf=GetSessionFactory.getSessionFactory();
        Session ses=sf.openSession();
        ses.beginTransaction();
        Songs song=ses.get(Songs.class,99);
        System.out.println(song);
        System.out.println("Data Retrived Successfully!!!");
        ses.close();
        sf.close();
    }
}
