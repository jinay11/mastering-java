package core;

import java.util.Scanner;

public class UserInputJaggedInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of row");
        int row = sc.nextInt();

        int arr[][] = new int[row][];

        //create each row
        for(int i=0; i < row;i++){
            System.out.println("Enter the columns of row " + i + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
        }

        //Take element
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element of row : ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        //print the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
