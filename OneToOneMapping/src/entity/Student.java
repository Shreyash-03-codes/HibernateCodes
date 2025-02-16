package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String className;
    @OneToOne(cascade = CascadeType.ALL)
    private Addhar addhar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Addhar getAddhar() {
        return addhar;
    }

    public void setAddhar(Addhar addhar) {
        this.addhar = addhar;
    }
}
