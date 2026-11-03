package collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {

    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Employee s) {
        return this.age - s.age;
    }
}

public class ComparableEx {
    public static void main(String[] args) {

        ArrayList<Employee> emp = new ArrayList<>();

        emp.add(new Employee("Jon" , 22));
        emp.add(new Employee("Rahul", 22));
        emp.add(new Employee("Amit", 20));
        emp.add(new Employee("John", 25));
        emp.add(new Employee("Raj", 21));

        Collections.sort(emp);

        for (Employee s : emp) {
            System.out.println(s.name + " " + s.age);
        }

    }
}
