package com.java.oop.exception.student;

public class StudentList {
    private Student[] list = new Student[100];
    private int p = 0;

    public int getP(){
        return p;
    }

    public void add(Student s) {

        list[p++] = s;
    }

    public Student get(int n) {
        return list[n];
    }

    public int find(String name) {
        for (int i = 0; i < p; i++) {
            if (list[i].getName().equalsIgnoreCase(name))
                return i;
        }

        return -1;
    }

    public void delete(int n)throws IllegalArgumentException {
        if (n < 0 || n >= list.length || n > p) {
            throw new IllegalArgumentException("There is no student in the list");
            //return; // index out of bounds
        }
        Student[] t = new Student[list.length - 1];
        System.arraycopy(list, 0, t, 0, n);
        System.arraycopy(list, n + 1, t, n, t.length - n);

        list = t;
        --p;
    }
}

