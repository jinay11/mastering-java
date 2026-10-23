package Interface;

import java.util.Scanner;


interface client {

    void input(); //method are bydefault public and abstract
    void output();

}

class Jon implements client {

    String name;
    double salary;

    public void input() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        name = sc.nextLine();

        System.out.println("Enter your salary : ");
        salary = sc.nextDouble();

    }

    public void output() {

        System.out.println("name : "  + name);
        System.out.println("salary : " + salary);

    }
}

public class Interface {

    public static void main(String[] args) {

        Jon j = new Jon();
        j.input();
        j.output();

    }
}
