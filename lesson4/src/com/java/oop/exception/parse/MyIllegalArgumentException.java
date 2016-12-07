package com.java.oop.exception.parse;
/**
 Придумать свое исключение и написать соответствующий класс
 и использующий его код.
 */
public class MyIllegalArgumentException extends Exception {
    public MyIllegalArgumentException(String message){
        super(message);
    }
    @Override
    public String getMessage(){
        return "MyIllegalArgumentException: " + super.getMessage();
    }
}
