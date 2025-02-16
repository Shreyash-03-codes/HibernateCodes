package entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="studentDetails")
public class Student {

    @Id
    private int roll;
    @Column(name = "name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="mark")
    private int mark;

    public void setName(String name){
        this.name=name;
    }

    public void setRoll(int roll){
        this.roll=roll;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public void setMark(int mark){
        this.mark=mark;
    }

    public int getRoll(){
        return this.roll;
    }
    public int getMark(){
        return this.mark;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString(){
        return this.name+" "+this.roll+" "+this.mark+" "+this.mark;
    }
}
