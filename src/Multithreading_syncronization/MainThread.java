package Multithreading_syncronization;

public class MainThread {

    public void run() {
        System.out.println("run method is calling...");
    }

    public static void main(String[] args) {

        System.out.println("Main thread is created by the JVM");

        System.out.println("name of thread : " + Thread.currentThread().getName());

        System.out.println("Hello JAVA , welcome to multithreading");

        //main thread create a multiple child thread

        MainThread mt = new MainThread();
        mt.run();

    }

}
