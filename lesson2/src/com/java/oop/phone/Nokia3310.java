package com.java.oop.phone;

public class Nokia3310 extends Phone {

    public Nokia3310(String number) {
        System.out.println("Nokia3310 constructor");
        super.number = number;
        touch = false;
        hasWifi = false;
        screenSize = 2;
    }

    @Override
    public void answer() {
        System.out.println("Nokia3310 is on the line!");
    }

    @Override
    public void call(String number) {
        System.out.println("Nokia3310 class is calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Nokia3310 class is sending sms " + message + " to " + number);
    }
}
