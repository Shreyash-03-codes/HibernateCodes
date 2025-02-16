package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Addhar {
    @Id
    private String addharNumber;
    private int age;
    @OneToOne(mappedBy = "addhar")
    private Student student;

    public String getAddharNumber() {
        return addharNumber;
    }

    public void setAddharNumber(String addharNumber) {
        this.addharNumber = addharNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
