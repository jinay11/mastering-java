package arrays;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {

        System.out.println("ArrayClass provide a operation on arrays like sorting, searching, comparing and converting arrays");

        int arr[] = {50,10,80,20,1};

        //1. Arrays.toString print the array

        System.out.println(Arrays.toString(arr));

        //2.Arrys.sort in array in ascending order

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        //3. Arrays.equals() Check the two array contain the same element

        int num1[] = {1,2,3};

        int num2[] = {1,3};

        System.out.println(Arrays.equals(num1,num2));

        //4 Arrays.fill puts the same value in every position

        int fils[] = new int[5];

        Arrays.fill(fils, 50);

        System.out.println(Arrays.toString(fils));

        //5 Arrays.copyOf  create a copy of an array

        int[] newArr = Arrays.copyOf(num1, 5);

        System.out.println(Arrays.toString(newArr));

        //final array once we declared the array as a final we can not change the array but modifie
        //once array decalred as a final it can not be changed

        final int[] numeric = {1,2,3};

        System.out.println(numeric[1]);

        numeric[1] = 22;

        System.out.println("after the modified " + numeric[1]);

        for (int i = 0; i < numeric.length; i++) {
            System.out.print(numeric[i] + " ");
        }

//        numeric = new int[4];
        //Cannot assign a value to final variable 'numeric

    }
}
