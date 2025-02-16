package test;

import org.hibernate.SessionFactory;
import utils.GetSessionFactory;

public class CheckSessionFactory {
    public static void main(String[] args) {
        SessionFactory s1=GetSessionFactory.getSessionFactory();
        SessionFactory s2=GetSessionFactory.getSessionFactory();

        if(s1==s2){
            System.out.println("Both are same!!!");
        }
        else{
            System.out.println("Not SAME!!!");
        }

    }
}
