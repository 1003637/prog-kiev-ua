package com.java.oop.figure;

public class Circle extends Figure {
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
    public void square() {
        square = Math.PI* Math.pow(r,2);
        System.out.println("Circle's square is " + square);
    }
}
