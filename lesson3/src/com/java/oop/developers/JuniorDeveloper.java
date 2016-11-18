package com.java.oop.developers;

public class JuniorDeveloper extends Developer {

    public JuniorDeveloper(String name, double basicSalary, int experience, String title) {
        super(name, basicSalary, experience, title);
    }

    @Override
    public double getSalary() {
        return basicSalary + (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }
}
