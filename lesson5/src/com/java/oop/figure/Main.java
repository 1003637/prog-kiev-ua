package com.java.oop.figure;
import com.java.oop.human.HumanComparator;
import java.util.Arrays;
/*
Создать список фигур. Реализовать сортировку списка по возрастанию площади фигуры.
 */
public class Main {
    public static void main(String[] args) {
        Figure[] list = {
                new Circle(4), new Triangle(20, 21, 22), new Rectangle(3,4)};
        Arrays.sort(list, new FigureComparator());
        for (Figure h : list)
            System.out.println(h.square());
    }
}
