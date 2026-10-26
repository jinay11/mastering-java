package ExceptionHandling;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }

}

public class TestCustomException {

    public static void main(String[] args) {

        double balance = 50000.00;
//        int withdraw = 2000;

        System.out.println("Enter the amount for withdraw");
        Scanner sc = new Scanner(System.in);
        double withdraw = sc.nextDouble();

        sc.nextLine();

        try {
            if (withdraw > balance) {

                throw new InsufficientBalanceException("Withdraw failed! \ninsufficient balance in your account");

            } else {

                System.out.println("Money Withdraw successfully :) ");

                System.out.println("If you want to print the balance yes or no ");

                String msg;

                while (true) {
                    System.out.println("Do you want to print the balance? (yes/no)");
                    msg = sc.nextLine().toLowerCase().trim();

                    switch (msg) {

                        case "yes":
                            System.out.println("Your current balance is " + (balance - withdraw));
                            break;
                        case "no":
                            System.out.println("Thank You :)");
                            break;
                        default:
                            System.out.println("Enter only yes or no");
                            continue;
                    }
                    break;

                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}