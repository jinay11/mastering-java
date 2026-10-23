package Interface;

class A {

    //nested interface declared inside another class or interface
    interface B {

        void show();

    }
}

class Test implements A.B {

    public void show() {
        System.out.println("interface declared inside class or interface it's called nested interface");
    }

}

public class NestedIntrfc {

    public static void main(String[] args) {

        Test t = new Test();
        t.show();

    }

}
