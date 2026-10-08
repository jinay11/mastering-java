package oop;

class Parent {
    int age = 50;

    void show() {
        System.out.println("This is the parent class method");
    }

    Parent(){
        System.out.println("Parent constructor");
    }

}

class Child extends Parent {

    int age = 20;

    void show(){
        System.out.println("This is the child class method");
        super.show();
    }

    public void display() {
        System.out.println("The son age is : " + age);
        System.out.println("The parent age is : " + super.age);
    }

    Child(){
        super(); //it is call a parent class constructor
        System.out.println("Child constructor");
    }

}

public class SuperKeyword {
    public static void main(String[] args) {

        Child c = new Child();
        c.display();

        c.show();

    }
}
