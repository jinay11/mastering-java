package oop;

class Calculator {

    void add(int a, int b) {
      int c =   a + b;
        System.out.println(c);
    }

    void add(int a, int b, int c) {
        c =  a + b + c;
        System.out.println("c = " + c);
    }

}

public class MethodOverloading {

    // it is a compile time polymorphism

    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.add(10,20);
        c.add(10,20,10);

        //same method name different parameter into same class


    }

}
