package test;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entity.Songs;
import utils.GetSessionFactory;

public class UpdateData {
    public static void main(String[] args) {


        SessionFactory sf=GetSessionFactory.getSessionFactory();
        Session ses=sf.openSession();
        ses.beginTransaction();
        Songs song=ses.get(Songs.class,99);
        song.setYear("2014");
        song.setSongName("SummerTimes Sadness");
        ses.getTransaction().commit();
        System.out.println("Changes Saved Successfully!!!");
        ses.close();
        sf.close();
    }
}
