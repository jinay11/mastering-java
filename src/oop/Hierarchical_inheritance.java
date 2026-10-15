package oop;

class BankA {

    void messageA() {
        System.out.println("Server down From Bank A");
    }
}

class BankB extends BankA{
    void messageB() {
        System.out.println("Server down from Bank B");
    }
}

class BankC extends  BankA{
    void messageC() {
        System.out.println("Payment accepted from Bank C");
    }
}

public class Hierarchical_inheritance {

    //one parent multiple child

    public static void main(String[] args) {

        BankB bb = new BankB();
        bb.messageA();
        bb.messageB();

        System.out.println("---------------Bank c ---------------------");

        BankC bc = new BankC();
        bc.messageA();
        bc.messageC();


    }

}
