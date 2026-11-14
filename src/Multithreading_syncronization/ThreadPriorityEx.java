package Multithreading_syncronization;

public class ThreadPriorityEx extends Thread {

    public void run() {
        System.out.println(
                Thread.currentThread().getName()
                + " Priority : "
                + Thread.currentThread().getPriority()
        );
    }

    public static void main(String[] args) {

        ThreadPriorityEx t1 = new ThreadPriorityEx();
        ThreadPriorityEx t2 = new ThreadPriorityEx();
        ThreadPriorityEx t3 = new ThreadPriorityEx();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();

    }

}
