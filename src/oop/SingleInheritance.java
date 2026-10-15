package oop;

class A {

    void messageA(){

        System.out.println("This is the A class");

    }

}

class B extends A {

    void messageB() {

        System.out.println("This is the B class");

    }

}

public class SingleInheritance {

    public static void main(String[] args) {

        B b = new B();
        b.messageB();
        b.messageA();
    }
}
