package oop;

class Animal{

    public void eat() {
        System.out.println("Animal can eat");
    }

}

class Dog extends Animal{

    void sound(){
        System.out.println("Dog Barks");
    }

//  extend keyword archive a inheritance

}

public class Inheritance {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.sound();

    }

}
