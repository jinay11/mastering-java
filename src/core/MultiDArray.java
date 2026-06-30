package core;

import java.util.Scanner;

public class MultiDArray {
    public static void main(String[] args) {

        // decalaration
        // int[][] arr = new int[2][2];

        // creation
        // arr[0][0] = 1;
        // arr[0][1] = 2;

        // arr[1][0] = 3;
        // arr[1][1] = 4;

        // System.out.println(arr[1][1]);

        // Traversing array
        // outer loop is a row
        // for (int i = 0; i < arr.length; i++) {

        //     // inner loop column loop
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row");
        int row = sc.nextInt();
        System.out.println("Enter the column");
        int colum = sc.nextInt();

        int[][] arr = new int[row][colum];

        //Taking input from the user
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < colum; j++) {
                arr[i][j] = sc.nextInt();
            }
            
        }

        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
