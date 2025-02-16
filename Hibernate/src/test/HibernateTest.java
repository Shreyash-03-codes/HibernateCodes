package test;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import entity.Student;
public class HibernateTest {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("configuration/hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student.class);

        SessionFactory sf=cfg.buildSessionFactory();
        Session ses=sf.openSession();
        Transaction tx=ses.beginTransaction();

        Student st=new Student();
        st.setId(39);
        st.setName("Shreyash Gurav");
        st.setMark(65);
        st.setEmail("shreyash@gmail.com");

        ses.save(st);

        tx.commit();

        ses.close();
        sf.close();
        System.out.println("Data Inserted Successfully!!!");
    }
}
