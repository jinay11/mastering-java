package method;

public class Method {

    //static method
    public static void greet() {
        System.out.println("Hello Java Devloper :) ");
    }

    //instance method
    public void printMessage() {
        System.out.println("Hello from method");
    }

    //method call stack
    public void methodA() {
        methodB();
    }

    public void methodB() {
        methodC();
    }

    public void methodC() {
        System.out.println("Hello from method A, B and C From method call stack");
    }

    public static void main(String[] args) {

        System.out.println("Method in java");

        Method m = new Method();

        m.printMessage();

        m.methodA();

        //static method access  directly
        greet();

    }
}
