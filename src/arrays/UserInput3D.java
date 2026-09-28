package arrays;

import java.util.Scanner;

public class UserInput3D {

    public static void main(String[] args) {

        System.out.println("user input in 3D ");

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the layers : ");
        int layers = sc.nextInt();

        System.out.println("Enter the rows");
        int rows = sc.nextInt();

        System.out.println("enter the columns");
        int col = sc.nextInt();

        //create a array
        int[][][] arr = new int[layers][rows][col];

        //create a loop for taking the user input
        for (int i = 0; i < layers; i++) {

            System.out.println("layers" + (i + 1));

            for (int j = 0; j < rows; j++) {

                for (int k = 0; k < col; k++) {

                    System.out.println("enter value " + "[" +i+"]"+ "[" + j+"]" + "["+ k+"]");
                    arr[i][j][k] = sc.nextInt();

                }
            }
        }

        //print the result
        System.out.println("Printig the result");

        for (int i = 0; i < layers; i++) {

            for (int j = 0; j < rows; j++) {

                for (int k = 0; k < col; k++) {

                    System.out.print(arr[i][j][k] + " ");

                }

                System.out.println();

            }

        }

    }

}