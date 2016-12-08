package com.java.oop.figure;

public class Circle implements Figure{
    private double r;

    public Circle(double r){
        if(r > 0){
            this.r = r;
        }else {
            System.out.println("Circle's redius cannot be negative!");
        }
    }

    public double getR(){
        return r;
    }

    public void setR(){
        if(r > 0) {
            this.r = r;
        }else {
            System.out.println("Circle's redius cannot be negative!");
        }
    }
    @Override
    public double square() {
        return Math.PI* Math.pow(r,2);
    }
}
