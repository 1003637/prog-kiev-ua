package com.java.oop.figure;

public class Rectangle implements Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b){
        if (a > 0 || b > 0) {
            this.a = a;
            this.b = b;
        }else{
            System.out.println("Rectangle's side cannot be negative!");
        }
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public void setA(double a){
        if(a > 0){
            this.a = a;
        }else{
            System.out.println("Rectangle's side cannot be negative!");
        }
    }
    public void setB(double b){
        if(a > 0){
            this.b = b;
        }else{
            System.out.println("Rectangle's side cannot be negative!");
        }
    }

    @Override
    public double square() {
        return a * b;
    }
}
