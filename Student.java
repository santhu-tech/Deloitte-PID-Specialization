package com.day3.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student other) {
        return this.age - other.age ;//Do the sorting based on the age
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("John" ,32));
        students.add(new Student("Dabby" ,12));
        students.add(new Student("Tube" ,46));
        Collections.sort(students);
        System.out.println(students);
    }


}
