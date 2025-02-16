package test;

import entity.Addhar;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("configure/hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student.class);
        cfg.addAnnotatedClass(Addhar.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session ses=sf.openSession();

        ses.beginTransaction();
        Student st=new Student();
        st.setClassName("Second Year");
        st.setName("Shreyash gurav");
        st.setId(36);

        Addhar addhar=new Addhar();
        addhar.setAddharNumber("2222-1412-2562");
        addhar.setAge(19);
        addhar.setStudent(st);
        st.setAddhar(addhar);
        ses.save(st);
        ses.save(addhar);

        ses.getTransaction().commit();
        System.out.println("Data Inserted Successfully!!!!");
    }
}
