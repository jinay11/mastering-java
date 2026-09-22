package basic;

public class ArrayPrac {
    public static void main(String[] args) {
        System.out.println("Array in java");

//        int[] numbers = {10,20,30,40,50};
//        int n = numbers.length;

        //primitive type stored in continue in memory
//        System.out.println("primitive array -> ");
//        for (int i=0; i< n; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();

        //non-primitive
//        System.out.println("non-primitive array -> ");
//        String[] names = {"Jon", "Dennis", "Reo"};
//        for (int i=0; i< names.length; i++) {
//            System.out.print(names[i] + " ");
//        }

        //operation on array

        //1. Access the array element.
        int numbers[] = {10,20,30,30,40};
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);

        //2. update the first element
        numbers[0] = 100;
        System.out.println("new value : " + numbers[0]);

        //3. Traverse array means accessing each element one by one
        for (int i=0; i< numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //4. size of array
        System.out.println("Size of array : " + numbers.length);
    }
}
