package basic;

public class Variable {

    static String  sentence = "This is the instance variable ";

    public static void show() {
        int num = 12;
        System.out.println( num+ " this number access only this method");
    }

    public static void main(String[] args) {
        int age = 28;
        String name = "Jon Doe";
        double salary = 50000.50;

        System.out.println("Welcome " + name + " you are a " + age + " years old ");
        System.out.println("Salary : " + salary);

        show();

//        System.out.println(num); local variable not accessiable
        System.out.println(sentence);

        if(true) {
            int x = 10;
            System.out.println(x);
        }
//        System.out.println(x); not access

    }
}
