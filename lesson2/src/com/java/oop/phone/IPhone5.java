package com.java.oop.phone;

public class IPhone5 extends Phone {
    public IPhone5(String number) {
        System.out.println("IPhone5 constructor");
        super.number = number;
        screenSize = 4;
    }

    @Override
    public void answer() {
        System.out.println("IPhone5 is on the line!");
    }

	@Override
	public void call(String number) {
		System.out.println("IPhone5 class is calling " + number);
	}

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("IPhone5 class is sending sms " + message + " to " + number);
    }
}
