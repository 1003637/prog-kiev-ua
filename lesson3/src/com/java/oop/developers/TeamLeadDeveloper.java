package com.java.oop.developers;


public class TeamLeadDeveloper extends Developer {
    public TeamLeadDeveloper(String name, double basicSalary, int experience, String title) {
        super(name, basicSalary, experience, title);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 4) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }

}
