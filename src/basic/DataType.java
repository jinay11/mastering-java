package basic;

public class DataType {
    public static void main(String[] args) {
        System.out.println("Primitive Type");
        byte age = 22;
        short marks = 500;
        int salary = 10000;
        long population = 80000000000l;
        float price = 12.21f;
        double pi = 3.14;
        char grade = 'A';
        boolean status = true;

        System.out.println(age);
        System.out.println(marks);
        System.out.println(salary);
        System.out.println(population);
        System.out.println(price);
        System.out.println(pi);
        System.out.println(grade);
        System.out.println(status);

        System.out.println("Non- Primitive");
        String name = "Jon Doe";
        System.out.println(name);

        int[] numbers = {10,20,30};
        System.out.println(numbers[0]);
    }
}
