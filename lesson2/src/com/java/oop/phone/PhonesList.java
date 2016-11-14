package com.java.oop.phone;

public class PhonesList {
    private Phone[] phonesList;
    private int index;

    public PhonesList(int n){
        phonesList = new Phone[n];
    }

    public void add(Phone phone){
        phonesList[index++] = phone;
    }

    public Phone get(int i){
        return phonesList[i];
    }

    public int find(String number){
        for(int i = 0; i < index; i++){
            if(phonesList[i].getNumber().equalsIgnoreCase(number))
                return i;
        }
        return -1;

    }
}
