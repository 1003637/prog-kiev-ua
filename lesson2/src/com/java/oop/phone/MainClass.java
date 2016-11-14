package com.java.oop.phone;

/**
 * Написать код для связи телефонов между собой. У
 каждого телефона будет свой номер. При вызове
 call(x) телефон должен найти собеседника по
 номеру x из всех доступных в данный момент
 телефонов )из всех созданных объектов типа
 Phone) и вызвать его метод answer().

 */
public class MainClass {
    public static void main(String[] args) {

        String[] list = {"123-45-66","123-45-67","123-45-68","123-45-69"};
        int index = 0;
        Nokia3310 nokia = new Nokia3310(list[3]);
        IPhone iphone = new IPhone(list[2]);
        IPhone5 iphone5 = new IPhone5(list[1]);
        SamsungS4 samsungS4 = new SamsungS4(list[0]);

        PhonesList phonesList = new PhonesList(list.length);
        phonesList.add(nokia);
        phonesList.add(iphone);
        phonesList.add(iphone5);
        phonesList.add(samsungS4);
        System.out.println("---------------------------------------------");
        for (int i = 0; i < list.length; i++){
            phonesList.get(i).call(list[i]);
            index = phonesList.find(list[i]);
            phonesList.get(index).answer();

        }

    }

}
