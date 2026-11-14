package Multithreading_syncronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i=1; i <= 5 ;i++) {
            int task = 1;

            pool.execute(()-> {
                System.out.println(Thread.currentThread().getName() + " is executing Task : " + task);
            });

        }

        pool.shutdown();
    }
}
