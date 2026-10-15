package oop;

class Parentt{

    void messageA() {
        System.out.println("This is the parent class");
    }

}

class Childs extends Parentt {

    void messageB() {
        System.out.println("This is the child class");
    }

}

class GrandChilds extends Childs {

    void messageC() {
        System.out.println("This is the GrandChild");
    }

}

public class Multilevel_inheritance {

    public static void main(String[] args) {

        GrandChilds gc = new GrandChilds();
        gc.messageA();
        gc.messageB();
        gc.messageC();

    }

}
