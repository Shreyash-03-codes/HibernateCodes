package test;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.GetSessionFactory;
import entity.Songs;
public class CreateData {
    public static void main(String[] args) {


        SessionFactory sf=GetSessionFactory.getSessionFactory();
        Session ses=sf.openSession();
        ses.beginTransaction();

        Songs songs=new Songs();
//        songs.setSongId(900);
        songs.setSongName("too many things");
        songs.setSinger("Alex");
        songs.setYear("2012");

        ses.save(songs);

        ses.getTransaction().commit();
        System.out.println("Data Inserted Successfully!!!!");
        ses.close();
        sf.close();

    }
}
