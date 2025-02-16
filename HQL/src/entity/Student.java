package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    int roll;
    int age;
    int mark;
    String name;

    public Student(){

    }

   public Student(int roll,int age,int mark,String name){
        this.roll=roll;
        this.age=age;
        this.mark=mark;
        this.name=name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", age=" + age +
                ", mark=" + mark +
                ", name='" + name + '\'' +
                '}';
    }
}
