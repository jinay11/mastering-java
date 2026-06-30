package core;

class Test {

    public void greet() {
        System.out.println("GeeksForGeeks");
    }

}


public class Methods {

    public static void message() {
        System.out.println("A Method in java is a block of code that perform a specific task");
        System.out.println("Method can take a input and return the output");
        System.out.println("method reduce the code repetition");
        System.out.println("method is readable and reuseable");
    }

    public static void main(String[] args) {
        System.out.println("Method in java");

        message();

        Test test = new Test();
        test.greet();

    }
}