package arrays;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

//        declaring the array
        int[][] arr;

//        intializing row and cloumns sizes
        arr = new int[1][3];

        arr[0][0] = 3;
        arr[0][1] = 6;
        arr[0][2] = 9;

//        defining the values
        System.out.println("arr[0][0] " + arr[0][0]);
        System.out.println("arr[0][1] " + arr[0][1]);
        System.out.println("arr[0][2] " + arr[0][2]);

    }

}
