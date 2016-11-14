package com.java.oop.phone;

public class IPhone extends Phone {
    public IPhone(String number) {
        System.out.println("IPhone constructor");
        super.number = number;
        touch = true;
        hasWifi = true;
        screenSize = 3;
    }

    @Override
    public void answer() {
        System.out.println("IPhone is on the line!");
    }

    @Override
    final public void call(String number) {
        System.out.println("IPhone class is calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("IPhone class is sending sms " + message + " to " + number);
    }
}
