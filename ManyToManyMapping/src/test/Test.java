package test;

import entity.Answer;
import entity.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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

        Question q1=new Question();
        q1.setId(12);
        q1.setQuestion("What?");

        Answer a1=new Answer();
        a1.setId(90);
        a1.setAnswer("Yes!");

        Answer a2=new Answer();
        a2.setId(99);
        a2.setAnswer("No!");

        Answer a3=new Answer();
        a3.setId(95);
        a3.setAnswer("Wow!");

        List<Answer> list=new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);

        q1.setAnswers(list);

        List<Question> l=new ArrayList<>();


        Question q2=new Question();
        q2.setId(45);
        q2.setQuestion("Why?");
        q2.setAnswers(list);

        Question q3=new Question();
        q3.setId(24);
        q3.setQuestion("Who?");
        q3.setAnswers(list);

        l.add(q1);
        l.add(q2);
        l.add(q3);

        a1.setQuestions(l);
        a2.setQuestions(l);
        a3.setQuestions(l);
        ses.save(q1);
        ses.save(q2);
        ses.save(q3);

        ses.save(a1);
        ses.save(a2);
        ses.save(a3);

        ses.getTransaction().commit();


        System.out.println("Data Saved Successfully!!!!");



    }
}
