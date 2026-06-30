package core;

public class JaggedArray {
    public static void main(String[] args) {
        // Jagged array is a multidimisional array where each row has a different
        // numbers of columns

        // int arr[][] = new int[3][];
        // arr[0] = new int[5];
        // arr[1] = new int[4];
        // arr[2] = new int[3];

        // int count = 1;

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // arr[i][j] = count++;
        // }
        // }

        // output
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
        // System.out.println("Hello World");

        int r = 5;
        int arr[][] = new int[r][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
        }

        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        System.out.println("Contents of 2D Jagged Array");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}