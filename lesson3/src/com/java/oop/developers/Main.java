package com.java.oop.developers;

/**
 1.Написать своего наследника Developer. Добавить его в
 существующий проект.
 2. Создать список разработчиков и заполнить его случайным
 образом. Вывести на экран только Senior developer-ов с
 зарплатой больше 1500 у.е.
 3. Написать код, который разделит список объектов Developer
 на 3 отдельных списка для Juniors, Seniors и Team Leads.
 Вывести списки на экран.
 */

public class Main {
    public static void main(String[] args){

        String[] titlelits = {"junior", "middle", "senior", "lead"};
        DevelopersList devlist = new DevelopersList(8);

        devlist.add(new JuniorDeveloper("Ivan", 500, 0, titlelits[0]));
        devlist.add(new SeniorDeveloper("Alex", 1000, 2, titlelits[2]));
        devlist.add(new TeamLeadDeveloper("Denis", 1200, 5, titlelits[3]));
        devlist.add(new SeniorDeveloper("Bogdan", 1000, 4, titlelits[2]));
        devlist.add(new SeniorDeveloper("Maksym", 1000, 3, titlelits[2]));
        devlist.add(new JuniorDeveloper("Vladimir", 500, 1, titlelits[0]));
        devlist.add(new MiddleDeveloper("Sem", 800, 2, titlelits[1]));
        devlist.add(new SeniorDeveloper("Igor", 500, 3, titlelits[2]));

        System.out.println("-----------------------------");
        System.out.println("Name " + "Salary");
        for(int i = 0; i < devlist.getIndex(); i++){
            if(devlist.get(i).getSalary() > 1500 && devlist.get(i).getTitle().equals(titlelits[2])){
                System.out.println(devlist.get(i).getName() + " " + devlist.get(i).getSalary());
            }
        }

        System.out.println("-----------------------------");
        for (int j = 0; j < titlelits.length; j++){
            for (int i = 0; i < devlist.getIndex(); i++){
                if(devlist.get(i).getTitle().equals(titlelits[j])){
                    System.out.println(titlelits[j] + " " + devlist.get(i).getName() + " " + devlist.get(i).getSalary());
                }
            }
            System.out.println("-----------------------------");
        }

    }
}
