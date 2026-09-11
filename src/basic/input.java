package basic;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int num1 = sc.nextInt();

//        System.out.println("Enter the second number : ");
//        int num2 = sc.nextInt();

//        System.out.println("Sum : " + (num1+num2));

        System.out.println("Enter the sentence ");
        String sentence = sc.nextLine();


        System.out.println("Enter the integer value");
        int number = sc.nextInt();


        System.out.println("Enter the float number");
        float num2 = sc.nextFloat();

        System.out.println(sentence + " your integer value is : " + number + " and float value is : " + num2);

    }
}
