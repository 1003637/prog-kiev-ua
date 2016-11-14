package com.java.oop.myexample;

public class Actor extends Artist {

    public Actor(String name, int age){
        super.setName(name);
        super.setAge(age);
    }
    @Override
    public void performance() {
        System.out.println("Actor performs a play!");
    }

}
