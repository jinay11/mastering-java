package Projects;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String name;
    int employeeId;
    String designation;
    int experience;
    int age;

    Employee(String name, int employeeId, String designation, int experience, int age) {
        this.name = name;
        this.employeeId = employeeId;
        this.designation = designation;
        this.experience = experience;
        this.age = age;
    }

}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[2];

        for (int i = 0; i < employees.length; i++) {

            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter employee ID: ");
            int employeeId = Integer.parseInt(sc.nextLine());

            System.out.print("Enter designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter experience (years): ");
            int experience = Integer.parseInt(sc.nextLine());

            System.out.print("Enter age: ");
            int age = Integer.parseInt(sc.nextLine());

            employees[i] = new Employee(name, employeeId, designation, experience, age);

        }

        //Display the Details
        System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("\nEmployee " + (i + 1));
            System.out.println("Name: " + employees[i].name);
            System.out.println("Employee ID: " + employees[i].employeeId);
            System.out.println("Designation: " + employees[i].designation);
            System.out.println("Experience: " + employees[i].experience + " years");
            System.out.println("Age: " + employees[i].age);
            System.out.println("--------------------");
        }
        sc.close();
    }
}
