package com.java.oop.developers;

public abstract class Developer {

    protected String name;
    protected double basicSalary;
    protected int experience;
    protected String title;

    public Developer(String name, double basicSalary, int experience, String title) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.experience = experience;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle(){
        return title;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public abstract double getSalary();
}
