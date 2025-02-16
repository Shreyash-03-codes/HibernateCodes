package entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="student")
public class Student {


    @Id
    @Column(name="studentId")
    private int id;
    @Column(name="studentName")
    private String name;
    @Column(name="studentEmail")
    private String email;
    @Column(name="mark")
    private int mark;

    public void setId(int id){
        this.id=id;
    }
    public void setMark(int mark){
        this.mark=mark;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public int getId(){
        return this.id;
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
}
