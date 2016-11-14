package com.java.oop;

public class Engine {
    private double capacity;
    private boolean flag = false;

    public Engine(double capacity){
        this.capacity = capacity;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public void setCapacity(double capacity){
        this.capacity = capacity;
    }

    public boolean isEngineWorking(){
        return this.flag;
    }
    public void startEngine(){
        System.out.println("Engine is started!");
        flag = true;

    }

    public void stopEngine(){
        System.out.println("Engine is stopped!");
        flag = false;
    }
}
