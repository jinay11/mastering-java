package basic;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        System.out.println("Welcome to Number Guessing game");

        int guessNumber = (int) (Math.random() * 100) + 1;

//        System.out.println("guessing number was : " + guessNumber);

        int attempts = 5;

        System.out.println("You have only " + attempts + " attempts to win ");

        Scanner sc = new Scanner(System.in);

        boolean won = false;

        for (int i = 1; i <= attempts; i++) {

            System.out.print("Enter the number : ");

            int userNumber = sc.nextInt();

            if(guessNumber == userNumber) {

                System.out.println("Congratulations! You win! at " + i + " attempts");

                won = true;

                break;

            }else if (guessNumber > userNumber) {

                System.out.println("Guess higher!");

            }else{

                System.out.println("Guess lower!");

            }

        }

        if(!won) {

            System.out.println("Game Over !");

            System.out.println("Correct number was : " + guessNumber);

        }

        sc.close();

    }

}
