package entity.user;

import entity.util.statics.Degree;
import entity.util.statics.Grade;
import entity.util.statics.School;
import entity.util.statics.Type;


public class User {



    private String name;
    private String surname;
    private String mail;
    private Type type;
    private  int age;
    private long userId;
    private String password;
    private Grade grade;
    private Degree degree;
    private School school;

    public User(String name,String surname,String mail,Type type,int age, long userId,String password,Grade grade,Degree degree,School school){
        this.setName(name);
        this.setSurname(surname);
        this.setMail(mail);
        this.setType(type);
        this.setAge(age);
        this.setUserId(userId);
        this.setPassword(password);
        this.setGrade(grade);
        this.setDegree(degree);
        this.setSchool(school);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getMail(){
        return this.mail;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
