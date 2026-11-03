package collections;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new java.util.PriorityQueue<>();

        q.add(40);
        q.add(10);
        q.add(30);
        q.add(20);

        System.out.println(q);

        System.out.println(q.poll() + " is removing in queue");

        System.out.println("this is the front element " + q.peek());

    }
}
