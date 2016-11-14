package com.java.oop.myexample;

public class Musician extends Artist{

    public Musician(String name, int age){
        super.setName(name);
        super.setAge(age);
    }
    @Override
    public void performance() {
        System.out.println("Musician performs playing on an instrument!");
    }
}
