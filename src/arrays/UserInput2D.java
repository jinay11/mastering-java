package arrays;

import java.util.Scanner;

public class UserInput2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter the number of cols");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the element in array");

        for (int i = 0; i < rows; i++) {
            for (int j=0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //printing the array
        System.out.println("You eneter the array : ");
        for (int i=0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
