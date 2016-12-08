package com.java.oop.figure;

public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;
    private double square;

    public Triangle(double a, double b, double c){
        if(a > 0 && b > 0 && c > 0) {
            this.a = a;
            this.b = b;
            this.c = c;
        }else {
            System.out.println("Triangle's side cannot be negative!");
        }
    }

    public double getSquare(){
        return square;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public void setA(double a){
        if(a > 0){
            this.a = a;
        }else {
            System.out.println("Triangle's side cannot be negative!");
        }
    }

    public void setB(double b){
        if(b > 0){
            this.b = b;
        } else {
            System.out.println("Triangle's side cannot be negative!");
        }
    }

    public void setC(double c){
        if(c > 0){
            this.c = c;
        } else {
            System.out.println("Triangle's side cannot be negative!");
        }
    }

    @Override
    public double square() {
        double p = 0;
        if(a == b && b == c){
            square = Math.pow(a,2) * Math.sqrt(3)/4;
        }else {
            p = (a + b + c)/2;
            square = Math.sqrt(p*(p - a)*(p - b)*(p - c));
        }
        return square;
    }
}
