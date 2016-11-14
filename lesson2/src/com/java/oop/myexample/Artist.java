package com.java.oop.myexample;

/**
 * Придумать любую свою иерархию классов
 */
public abstract class Artist {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age  > 0) {
            this.age = age;
        }else {
            System.out.println("Age cannot be nagative");
        }

    }

    public abstract void performance();
}
