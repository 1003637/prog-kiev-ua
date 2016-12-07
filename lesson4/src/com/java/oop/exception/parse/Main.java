package com.java.oop.exception.parse;
/**
 * Написать метод разбора списка параметров в формате URL:
 * para1=value1&param2=value2&param3=value3. В случае ошибки в
 * формате бросать исключение.
 */
public class Main {
    public static void main(String... args){
        Parser p = new Parser();
        try {
            p.parse("para1=value1&param2=value2");
        }
        catch (MyIllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
