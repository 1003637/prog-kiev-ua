package com.java.oop.phone;

public abstract class Phone {

    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    protected String number;
    protected int countCall;
    protected int countMessage;

    public Phone() {
        System.out.println("Phone constructor");

    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public String getNumber(){
        return number;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getCountCall(){
        return countCall;
    }

    public int getCountMassage(){
        return countMessage;
    }

    public abstract void answer();

    public abstract void call(String number);

    public abstract void sendSMS(String number, String message);
}
