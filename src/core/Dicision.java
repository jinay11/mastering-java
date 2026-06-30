package core;

public class Dicision {
    public static void main(String[] args) {

        // i) if statement execute a block of code when condition is true
        // int age = 17;
        // if(age >= 18) {
        // System.out.println("You are eligible to vote");
        // }

        // ii) if-else statement execute a block of code when condition is true
        // otherwise execute a another block of code
        // int age = 19;
        // if(age >= 18) {
        // System.out.println("You are eligible to vote");
        // }else{
        // System.out.println("You are not eligible to vote");
        // }

        // iii) if-else-if statement used when we have a multiple condition to check
        // int marks = 71;
        // if(marks >= 90) {
        //     System.out.println("Grade : A");
        // }else if(marks >= 80){
        //     System.out.println("Grade : B");
        // }else if(marks >= 70) {
        //     System.out.println("Grade : C");
        // }else if(marks >= 35) {
        //     System.out.println("Grade : D");
        // }else {
        //     System.out.println("Fail");
        // }

        // iv) nested if statement used when we have a condition inside another condition used  when second condition depends on first condition
        // int age = 19;
        // boolean license = true;

        // if(age >= 18) {
        //     if(license){
        //         System.out.println("You can Drive");
        //     }else{
        //         System.out.println("You need a license to drive");
        //     }
        // }else{
        //     System.out.println("You are not eligible to drive");
        // }

        // v) switch statement used when we have check a multiple condition based on value 
        int month = 4;

        switch(month) {
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            default :
                System.out.println("Invalid month");
            
        }

    }
}
