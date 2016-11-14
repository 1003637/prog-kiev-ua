package com.java.oop;

/**
Задание 2.
Написать класс, который умеет считать количество созданных объектов этого класса (static).
 */

public class Task2 {
    static private int count;

    Task2 (){
        count++;
    }

    public static int getCount(){
        return count;
    }
}
