package arrays;

import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {
        System.out.println("3D Array ");

//        int[][][] arr = {
//                {
//                        {1,2,3},
//                        {4,5,6}
//                },
//                {
//                        {7,8,9},
//                        {10,11,12}
//                }
//        };
//
//        System.out.println(arr[0][0][1]);
//        System.out.println(arr[1][1][1]);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of layers");
        int layer = sc.nextInt();

        System.out.println("Enter the numbers of row");
        int row = sc.nextInt();

        System.out.println("Enter the numbers of cols");
        int cols = sc.nextInt();

        int[][][] numbers = new int[layer][row][cols];

        //taking the input from user
        for (int i = 0; i < layer; i++) {

            System.out.println("\nLayer " + (i + 1));

            for (int j = 0; j < row; j++) {

                for (int k = 0; k < cols; k++) {

                    System.out.println("Enter value [" + i + "][" + j + "][" + k + "]: ");
                    numbers[i][j][k] = sc.nextInt();

                }

            }

        }

        //print the 3D Array
        System.out.println("\n3D Array : ");

        for (int i = 0; i < layer; i++) {

            System.out.println("Layer " + (i + 1) + ":");

            for (int j = 0; j < row; j++) {

                for (int k = 0; k < cols; k++) {

                    System.out.print(numbers[i][j][k] + " ");

                }

                System.out.println();

            }

        }

        sc.close();

    }

}