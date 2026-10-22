package oop;

abstract class Animals {

    abstract void sound();

}

class Cat extends Animals {
    void sound() {
        System.out.println("Cat make a meow meow sound..");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Cat c = new Cat();
        c.sound();

    }

}
