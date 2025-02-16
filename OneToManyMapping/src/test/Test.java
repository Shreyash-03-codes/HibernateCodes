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
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();

        Question question=new Question();
        question.setQuestionId(99);
        question.setQuestionName("What is Java?");

        List<Answer> list=new ArrayList<>();

        Answer answer1=new Answer();
        answer1.setAnswerId(101);
        answer1.setAnswerName("Java is Programming Language!!!");
        answer1.setQuestion(question);


        Answer answer2=new Answer();
        answer2.setAnswerId(102);
        answer2.setAnswerName("Java is Evergreen Coding Language!!!");
        answer2.setQuestion(question);

        Answer answer3=new Answer();
        answer3.setAnswerId(103);
        answer3.setAnswerName("Java is Coffee name!!!");
        answer3.setQuestion(question);
        list.add(answer1);
        list.add(answer2);
        list.add(answer3);
        question.setAnswers(list);

        session.save(question);
        session.save(answer1);
        session.save(answer2);
        session.save(answer3);

        session.getTransaction().commit();
        System.out.println("Data Inserted Successfully!!!!");

    }
}
