package core;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        // Input from the user
        // outer loop is the row
        for (int i = 0; i < rows; i++) {

            // inner loop column
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }

        }

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
