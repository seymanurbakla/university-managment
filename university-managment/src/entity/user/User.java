package entity.user;

import entity.util.Degree;
import entity.util.Grade;
import entity.util.School;
import entity.util.Type;


public class User {



    private String name;
    private String surname;
    private Type type;
    private  int age;
    private long userId;
    private String password;
    private Grade grade;
    private Degree degree;
    private School school;

    public User(String name,String surname,Type type,int age, long userId,String password,Grade grade,Degree degree,School school){
        this.name=name;
        this.surname=surname;
        this.type=type;
        this.age=age;
        this.userId=userId;
        this.password=password;
        this.grade=grade;
        this.degree=degree;
        this.school=school;
    }
}
