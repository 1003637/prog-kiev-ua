package com.java.oop.figure;

import java.util.Comparator;

public class FigureComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Figure f1 = (Figure) o1;
        Figure f2 = (Figure) o2;
        if(f1.square() < f2.square()){
            return -1;
        }
        if(f1.square() == f2.square()){
            return 0;
        }
        if (f1.square() > f2.square()){
            return 1;
        }
        return 0;
    }
}
