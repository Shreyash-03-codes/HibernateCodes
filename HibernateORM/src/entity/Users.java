package entity;

public class Users {
    private int id;
    private String name;
    private int age;
    private String email;

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getEmail(){
        return this.email;
    }

}
