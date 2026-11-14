package Multithreading_syncronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyClass {

    Lock lock = new ReentrantLock();

    void display() {
        lock.lock();

        try {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Hello java");
        }finally {
            lock.unlock();
        }
    }

}

public class LockEx {

    public static void main(String[] args) {

        MyClass obj = new MyClass();

        Thread t1 = new Thread(() -> obj.display());
        Thread t2 = new Thread(() -> obj.display());

        t1.start();
        t2.start();

    }

}
