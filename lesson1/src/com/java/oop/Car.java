package com.java.oop;

/**Задание 3.
Написать класс «автомобиль», который должен уметь заводится, глушить мотор, ехать и держать необходимую скорость.
* Добавить свойство «объем двигателя» в класс Engine.
* Написать код для вывода потраченного топлива на экран.*/

public class Car {
    private String brand;
    private Engine engine;

    public Car(String brand, double capacity){
        this.brand = brand;
        this.engine = new Engine(capacity);
    }

    public void start(){
        engine.startEngine();
    }

    public void stop(){
        engine.stopEngine();
    }

    public void go(double speed, double distance){
        if(!engine.isEngineWorking()) {
            engine.startEngine();
        }
        System.out.println("Car speed is " + speed + " km per hour");
        engine.stopEngine();
        System.out.println("Distance is " + distance + " km, " + "the fuel consumption is "
                            + distance*fuelRate()/100);
    }

    public double fuelRate(){
        return engine.getCapacity()*2;
    }
}
