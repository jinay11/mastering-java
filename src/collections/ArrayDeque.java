package collections;

import java.util.Queue;

public class ArrayDeque {
    public static void main(String[] args) {

        Queue<Integer> q = new java.util.ArrayDeque<>();

        //ArrayDeque follows the insertion order

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println(q);

        //Removing element

        q.remove();

        System.out.println(q);

        //getting first element
        System.out.println(q.peek());


    }
}
