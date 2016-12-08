package com.java.oop.human;
import com.java.oop.human.Human;
import com.java.oop.human.HumanComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human[] list = {
                new Human(40), new Human(20), new Human(3), new Human(7)
        };
        Arrays.sort(list, new HumanComparator());
        for (Human h : list)
            System.out.println(h.getAge());
    }
}
