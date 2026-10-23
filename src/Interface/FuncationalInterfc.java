package Interface;

import java.util.Scanner;

@FunctionalInterface
interface msg {
    void message();
}

class Info implements msg {

    public  void message() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Leave a  message : ");
        String msg = sc.nextLine();

        System.out.println("you say : " + msg);

    }

}

public class FuncationalInterfc {

    public static void main(String[] args) {

        Info inf = new Info();
        inf.message();

    }

}


//functional interface is the interface which has a only one abstract method and used with lambda expression