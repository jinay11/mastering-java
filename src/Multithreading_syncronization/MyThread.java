package Multithreading_syncronization;

public class MyThread extends Thread{

    public void run() {
        System.out.println("execute the task");
    }

    public static void main(String[] args) {

        MyThread t = new MyThread();

        //start create and execute a new task
//        t.start();

        //run containes the actual task or code that perform a thread
        t.run();

    }

}
