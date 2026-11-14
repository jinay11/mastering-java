package Multithreading_syncronization;

public class DeadLock {

    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() ->  {

            synchronized (lock1) {
                System.out.println("Thread 1 is lock");

                synchronized (lock2 ) {
                    System.out.println("Thread 1 has lock 2");
                }

            }

        });


        Thread t2 = new Thread(() -> {

            synchronized (lock2) {
                System.out.println("Thread 2 has lock 2");

                synchronized (lock1) {
                    System.out.println("Thread 2 has lock thread 1");
                }

            }

        });

        t1.start();
        t2.start();

    }
}
