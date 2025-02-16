package test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import entity.Student;
import utility.Utility;

public class Opertaions {
    Session session=null;
    Transaction transaction=null;

    public void insert(int roll,int mark,String name,String email){
        Student st=new Student();
        st.setEmail(email);
        st.setName(name);
        st.setRoll(roll);
        st.setMark(mark);

        try{
            session=new Utility().getSessionFactory().openSession();
            transaction=session.beginTransaction();
            session.save(st);
            transaction.commit();
            System.out.println("Data Inserted Succesfully!!!!");
            session.close();

        }
        catch(HibernateException e){
            e.printStackTrace();
        }
    }

    public void update(int roll,String email,int mark,String name){
        session=new Utility().getSessionFactory().openSession();
        transaction=session.beginTransaction();
        Student st=session.get(Student.class,roll);
        if(st!=null){
            st.setMark(mark);
            st.setRoll(roll);
            st.setName(name);
            st.setEmail(email);
            session.update(st);;
            System.out.println("Data Updated Successfully!!!!!");
            transaction.commit();
        }
        else{
            System.out.println("Data Updation failed!!!!");
        }
    }
    public void delete(int roll){
        session=new Utility().getSessionFactory().openSession();
        transaction=session.beginTransaction();
        Student st=session.get(Student.class,roll);
        if(st!=null){
            session.delete(st);
            System.out.println("Record Deleted Successfully!!!!!");
            transaction.commit();
        }
        else{
            System.out.println("Record Deletion Failed!!!!");
        }
    }

    public void getData(int roll){
        session=new Utility().getSessionFactory().openSession();
        transaction=session.beginTransaction();
        Student st=session.get(Student.class,roll);
        if(st!=null){

            System.out.println(st);
        }
        else{
            System.out.println("Record Loading Failed!!!!");
        }
    }
}
