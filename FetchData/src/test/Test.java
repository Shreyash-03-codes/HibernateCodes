package test;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import entity.Question;
import entity.Answer;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Configuration cfg=new Configuration();
        cfg.configure("configure/hibernate.cfg.xml");
        cfg.addAnnotatedClass(Question.class);
        cfg.addAnnotatedClass(Answer.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session ses=sf.openSession();
        ses.beginTransaction();

        Question q1=ses.get(Question.class,1);

        System.out.println(q1.getQuestionId());
        System.out.println(q1.getQuestion());
        List<Answer> list=q1.getAnswers();
        for(Answer a:list){
            System.out.println(a.getAnswerId()+"    "+a.getAnswer());
        }

        ses.getTransaction().commit();




    }
}
