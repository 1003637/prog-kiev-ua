package com.java.oop.rectangle;

/**
 4. Написать программу, которая будет рисовать на консоли
 прямоугольник с заданными длинами сторон.
 */
public class DrawRectangle {
    public static void main(String[] args){
        Rectangle rec = new Rectangle(4,8);
        System.out.println("width = " + rec.getWidth());
        System.out.println("height = " + rec.getHeight());
        rec.draw();
    }
}
