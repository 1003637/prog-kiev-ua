package com.java.oop;
/*
Задание 2.
Написать класс, который умеет считать количество созданных объектов этого класса (static).
 */
public class Circle {
    private double r;
    private int x;
    private int y;

    public Circle (int x, int y, double r){
        this.x = x;
        this.y = y;
        if( r < 0){
            System.out.println("Radius cannot be negative number!");
            r = 0;
        }else {
            this.r = r;
        }
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public double getR(){
        return this.r;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int Y){
        this.y = y;
    }

    public void setR(double r){
        if(r < 0){
            System.out.println("Radius cannot be negative number!");
            r = 0;
        }else{
            this.r = r;
        }

    }

    public double square(){
        return Math.PI * Math.pow(this.r,2);
    }
}
