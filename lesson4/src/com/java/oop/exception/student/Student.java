package com.java.oop.exception.student;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private Date birth;

    public Student(String name, String surname, Date birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException{
        if(name.isEmpty()){
            throw new IllegalArgumentException("Name is empty");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws IllegalArgumentException {
        if(surname.isEmpty()){
            throw new IllegalArgumentException("Surname is empty");
        }
        this.surname = surname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth)throws IllegalArgumentException {
        if(birth == null){
            throw new IllegalArgumentException("birth is empty");
        }
        this.birth = birth;
    }
}
