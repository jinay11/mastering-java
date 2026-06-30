package core;

public class Array {
    public static void main(String[] args) {

        // int[] numbers = {1,2,3,4,5};
        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        // System.out.println(numbers[2]);
        // System.out.println(numbers[3]);
        // System.out.println(numbers[4]);

        // second way of creating array
        // creation
        // String[] names = new String[3];

        // intializing
        // names[0] = "Jinay";
        // names[1] = "Anushka";
        // names[2] = "Shina";

        // accessing
        // System.out.println(names[0]);

        int numbers[] = {12,21,99,68,1,84};
        System.out.println("Before updating element " + numbers[2]);

        //update the array element
        numbers[2] = 89;
        System.out.println("After updating the element " + numbers[2]);

        //Traverse Array
        //Traverseing means accessing each element one by one using loop

        for(int i=0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


        //size of array 
        // System.out.println("size of array is " + numbers.length);
    }
}
