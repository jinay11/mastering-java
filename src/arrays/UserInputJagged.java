package arrays;

import java.util.Scanner;

public class UserInputJagged {
    public static void main(String[] args) {

        System.out.println("Jagged array in java");

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of rows");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][];

        for (int i = 0; i < rows; i++) {

            System.out.println("enter the numbers of  columns for row " + (i+1));
            int column = sc.nextInt();

            arr[i] = new int[column];

            for (int j = 0; j < column; j++) {

                System.out.println("Enter the value");
                arr[i][j] = sc.nextInt();

            }

        }

        System.out.println("----------------- print the result -----------------------------");

        //Display the array
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

            }

            System.out.println();
            
        }
        
    }

}