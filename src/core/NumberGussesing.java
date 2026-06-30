package core;

import java.util.Scanner;

public class NumberGussesing {

    public static void gussingNumberGame() {

        Scanner sc = new Scanner(System.in);

        // Generate the number
        int number = 1 + (int) (100 * Math.random());

        // number of attemptes
        int k = 5;

        System.out.println("A number is chosen between 1 to 100. ");
        System.out.println("you have " + k + " attemptes to guess the correct number. ");

        // loop for attemptes
        for (int i = 0; i < k; i++) {

            System.out.print("Enter your guess : ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Congratulation you guessed the correct numbers. ");
                sc.close();
            } else if (guess < number) {
                System.out.println("the number is grater than " + guess);
            } else {
                System.out.println("the numbe is less than " + guess);
            }
        }
        System.out.println("\"You've exhausted all attempts. The correct number was: " + number);
    }

    public static void main(String[] args) {
        System.out.println("Number gussessing game");
        gussingNumberGame();
    }
}
