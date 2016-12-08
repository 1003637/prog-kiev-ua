package com.java.oop.monitor;

public class DirEvent implements IDirEvent {
    @Override
    public void onDirectoryAdded(String s) {
        System.out.println("Directory added: " + s);
    }
}
