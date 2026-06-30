package core;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] arr = { 9, 4, 6, 2, 1 };
        System.out.println("Original array : " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted Array " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 4);
        System.out.println("Index of 4 : " + index);

        Arrays.fill(arr, 10);
        System.out.println("Filled : " + Arrays.toString(arr));

        // Final Array
        final int[] nums = { 12, 45, 11, 2, 92 };
        nums[0] = 13;
        nums[1] = 44;
        for (int i : nums) {
            System.out.print(i + " ");
        }

        // reasign the array not allowed
        // nums = new int[]{1,2,4};
    }
}
