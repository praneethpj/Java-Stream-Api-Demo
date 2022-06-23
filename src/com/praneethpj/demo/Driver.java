package com.praneethpj.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Driver {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Praneeth","12", Arrays.asList("80","90","40")));
        studentList.add(new Student("Oshan","16", Arrays.asList("65","78","90")));
        studentList.add(new Student("Anjalee","8", Arrays.asList("96","100","46")));

        studentList.stream().forEach(student-> System.out.println(student));
    }
}
