package com.praneethpj.demo;

import java.util.List;

public class Student {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(List marks) {
        this.marks = marks;
    }

    public Student(String name, int age, List marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", marks=" + marks +
                '}';
    }

    String name;
    int age;
    List marks;
}
