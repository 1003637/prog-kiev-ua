package com.java.oop.exception.student;

import java.text.ParseException;
import java.util.Scanner;
import java.text.DateFormat;
import java.util.Locale;
import java.text.SimpleDateFormat;

/**
 Модифицировать проект «Список студентов» так, чтобы 1)
 список вводился с клавиатуры 2) была возможность удалять
 студента по номеру 3) при введении неправильных данных
 (пустое имя, неправильная дата) программа кидала исключение
 и обрабатывала его с выводом соотв. сообщений на экран.
 */

public class Main {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        StudentList list = new StudentList();

        while (true) {

            System.out.println("Enter a if you want to add student");
            System.out.println("Enter s if you want to see amount of student");
            System.out.println("Enter d if you want to delete student");
            System.out.println("Enter q if you finish");
            input = scanner.nextLine();
            if ("q".equals(input)) {
                System.out.println("Exit!");
                break;
            }

            if ("s".equals(input)) {
                System.out.println("Amount of students : " + list.getP());
            }

            if ("d".equals(input)) {
                System.out.print("Enter the index:");
                input = scanner.nextLine();
                try{
                    list.delete(Integer.parseInt(input));
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                System.out.println("Amount of students : " + list.getP());
            }

            if(input.equals("a")) {
                Student s = new Student();
                try {
                    System.out.print("Enter name : ");
                    input = scanner.nextLine();
                    s.setName(input);
                    System.out.print("Enter surename : ");
                    input = scanner.nextLine();
                    s.setSurname(input);
                    System.out.print("Enter date : ");
                    input = scanner.nextLine();
                    s.setBirth(format.parse(input));
                    list.add(s);
                } catch (ParseException | IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("-----------\n");
        }
        scanner.close();
    }
}
