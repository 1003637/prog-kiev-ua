package com.java.oop.phone;

public class SamsungS4 extends Phone{

    public SamsungS4(String number){
        System.out.println("SamsungS4 constructor");
        super.number = number;
        screenSize = 5;
        hasWifi = true;
    }

    @Override
    public void answer() {
        System.out.println("SamsungS4 is on the line!");
    }


    @Override
    public void call(String number) {
        System.out.println("SamsungS4 class is calling " + number);
        countCall++;
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("SamsungS4 class is sending sms" + message + " Hello");
        countMessage++;
    }

}
