package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ComparatorEx {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 22));
        students.add(new Student("Amit", 20));
        students.add(new Student("John", 25));
        students.add(new Student("Raj", 21));

        Comparator<Student> ageSort = (s1, s2) -> {
            return s1.age - s2.age;
        };

        Collections.sort(students, ageSort);

        for (Student s : students) {
            System.out.println(s.name + " " + s.age);
        }

    }
}
