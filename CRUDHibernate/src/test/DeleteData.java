package test;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entity.Songs;
import utils.GetSessionFactory;

public class DeleteData {
    public static void main(String[] args) {


        SessionFactory sf=GetSessionFactory.getSessionFactory();
        Session ses=sf.openSession();
        ses.beginTransaction();

        Songs song=ses.get(Songs.class,2);

        if(song!=null){
            System.out.println(song);
            ses.delete(song);
            System.out.println("Data Deleted Successfully!!!");
        }
        ses.getTransaction().commit();
        ses.close();
        sf.close();

    }
}
