package arrays;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

        System.out.println("jagged array in java whare each row can have different number of columns");

//       int arr[][] = new int[3][];
//
//       arr[0] = new int[2];
//       arr[1] = new int[4];
//       arr[2] = new int[6];

        int arr [][] = {
                {1,2,3},
                {4,5,6,7,8},
                {9}
        };
//
//        System.out.println(arr[0][2]);
//        System.out.println(arr[1][3]);
//        System.out.println(arr[2][0]);

        //jagged array with loops
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

            }

            System.out.println();

        }

    }

}