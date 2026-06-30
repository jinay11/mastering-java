package core;

import java.util.Scanner;

public class DicisionTest {
    public static void main(String[] args) {

        // 1 Test case for checking is the giving number is odd or even number
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number for checking is odd or even number");

        // int num = sc.nextInt();
        // if(num %2 == 0) {
        // System.out.println("The giving number is Even");
        // }else{
        // System.out.println("The giving number is Odd");
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the age");

        // int age = sc.nextInt();
        // if(age >= 18) {
        // System.out.println("You are eligible to vote");
        // }else {
        // System.out.println("You are not eligible to vote");
        // }

        // 3 .check the given number is positive, negative or zero
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the numbers");

        // int num = sc.nextInt();

        // if(num > 0) {
        // System.out.println("Given number is positive");
        // }else if(num < 0) {
        // System.out.println("Given number is negetive");
        // }else {
        // System.out.println("Given number is Zero");
        // }

        // 4 .check the student fail or pass depends on marks
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the marks");
        // int marks = sc.nextInt();

        // if(marks >= 35) {
        // System.out.println("You are pass at the mark " + marks);
        // }else {
        // System.out.println("You are a Fail");
        // }

        // 5 . Largest of two numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number 1");
        // int a = sc.nextInt();

        // System.out.println("Enter the number 2");
        // int b = sc.nextInt();

        // System.out.println("a = " + a + " b = " + b);

        // if(a >= b) {
        // System.out.println("a is graterthan b ");
        // }else{
        // System.out.println("b is grater than a");
        // }

        // 6. Grade Calculator
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the marks : ");
        // int marks = sc.nextInt();

        // if(marks >= 90){
        // System.out.println("Grade A ");
        // }else if(marks >= 70 && marks >= 89) {
        // System.out.println("Grade B ");
        // }else if(marks >= 50 && marks >= 69) {
        // System.out.println("Grade C ");
        // }else {
        // System.out.println("Fail ");
        // }

        // 7. simple calculator
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number 1");
        // int num1 = sc.nextInt();

        // System.out.println("Enter the number 2 ");
        // int num2 = sc.nextInt();

        // System.out.println("Enter the operation symbol you perform on number +, -, *,
        // / :");
        // char symbol = sc.next().charAt(0);

        // switch (symbol) {
        // case '+':
        // System.out.println("num1 + num2 = " + (num1 + num2));
        // break;
        // case '-' :
        // System.out.println("num1 - num2 = " + (num1 - num2));
        // break;
        // case '*' :
        // System.out.println("num1 * num2 = " + (num1 * num2));
        // break;
        // case '/' :
        // System.out.println("num1 / num2 = " + (num1 / num2));
        // break;
        // default :
        // System.out.println("Used only + - * / symbols");
        // }

        // 8. Login
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the name : ");
        // String name = sc.nextLine();

        // System.out.println("Enter the password ");
        // String password = sc.nextLine();

        // String admin = "jinay";
        // String MathchPassword = "jinay123";

        // if(admin.equals(name) && password.equals(MathchPassword)) {
        // System.out.println("Loggin Successful ");
        // }else {
        // System.out.println("User not logged in ");
        // }

        // 9. month finder

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the 1 to 12");

        // int month = sc.nextInt();

        // switch (month) {
        //     case 1:
        //         System.out.println("January");
        //         break;
        //     case 2:
        //         System.out.println("Fabruary");
        //         break;
        //     case 3:
        //         System.out.println("March");
        //         break;
        //     case 4:
        //         System.out.println("April");
        //         break;
        //     case 5:
        //         System.out.println("May");
        //         break;
        //     case 6:
        //         System.out.println("Jun");
        //         break;
        //     case 7:
        //         System.out.println("July");
        //         break;
        //     case 8:
        //         System.out.println("Augest");
        //         break;
        //     case 9:
        //         System.out.println("September");
        //         break;
        //     case 10:
        //         System.out.println("Octomber");
        //         break;
        //     case 11:
        //         System.out.println("November");
        //         break;
        //     case 12:
        //         System.out.println("December");
        //         break;
        //     default:
        //         System.out.println("Invalid number");
        // }

        //Calculate the Electric bill
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the unit ");

        int unit = sc.nextInt();

        if(unit <= 100) {
            System.out.println("5 Ruppes per Unit");
        }else if (unit > 100 && unit < 200) {
            System.out.println("7 Ruppes per unit");
        }else {
            System.out.println("10 Ruppes per unit");
        }
        sc.close();
    }
}
