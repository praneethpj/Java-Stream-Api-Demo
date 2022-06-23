package com.praneethpj.demo;

import java.util.List;

public class Student {
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public List getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setMarks(List marks) {
        this.marks = marks;
    }

    public Student(String name, String age, List marks) {
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
    String age;
    List marks;
}
