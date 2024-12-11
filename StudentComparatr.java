package com.day3.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparatr {
    public String name;
    public int age;

    public StudentComparatr(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "StudentComparatr{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Main {

        public static void main(String[] args) {
            List<StudentComparatr> students = new ArrayList<>();
            students.add(new StudentComparatr("John", 32));
            students.add(new StudentComparatr("Dabby", 12));
            students.add(new StudentComparatr("Tube", 46));

           //nameComparator
            Comparator<StudentComparatr> nameComparator = (s1, s2) -> s1.name.compareTo(s2.name); // Name comparator

            //age Comparator
            Comparator<StudentComparatr> ageComparator = (s1, s2) -> s1.age - s2.age; // Age comparator


            Collections.sort(students, nameComparator);
            System.out.println("Sorted by name: " + students);


            Collections.sort(students, ageComparator);
            System.out.println("Sorted by age: " + students);
        }
    }
}
