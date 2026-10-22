package oop;

class Sum {

    void add(int a, int b) {
        int c = a + b;
        System.out.println("c = " + c);
    }

}

class Multi extends  Sum {

    @Override
    void add(int a, int b) {
        int c = a * b;
        System.out.println("c  = " + c);
    }

}

public class MethodOverriding {

    //runtime polymorphism
    //same method , same parameters into different class

    public static void main(String[] args) {

        Sum sum = new Sum();
        sum.add(10,20);

        Sum s = new Multi();
        s.add(10,20);

    }

}
