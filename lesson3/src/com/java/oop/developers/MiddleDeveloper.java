package com.java.oop.developers;


public class MiddleDeveloper extends Developer {
    public MiddleDeveloper(String name, double basicSalary, int experience, String title) {
        super(name, basicSalary, experience, title);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 1.5) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }
}
