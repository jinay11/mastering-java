package core;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] main) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row ");
        int row = sc.nextInt();
        System.out.println("Enter the column ");
        int colum = sc.nextInt();

        int arr[][] = new int[row][colum];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element you can search ");
        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if(arr[i][j] == x) {
                    System.out.println("x found at location (" + i + " , " + j + ")");
                }
            }
        }

        sc.close();
    }
}
