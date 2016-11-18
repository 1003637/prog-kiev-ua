package com.java.oop.developers;

public class SeniorDeveloper extends Developer {

    public SeniorDeveloper(String name, int basicSalary, int experience, String title) {
        super(name, basicSalary, experience, title);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 2) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }
}
