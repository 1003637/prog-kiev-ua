package com.java.oop.developers;

public class DevelopersList {

        private Developer []list;
        private int index;

    public DevelopersList(int n){
        list = new Developer[n];
    }

    public void add(Developer dev){
            list[index++] = dev;
    }

    public Developer get(int i){
        return list[i];
    }

    public int getIndex(){
        return index;
    }
}
