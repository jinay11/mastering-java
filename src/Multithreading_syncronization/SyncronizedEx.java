package Multithreading_syncronization;

class BankAccount {

    int balance = 10000;

    synchronized void withdraw(int amount) {

        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance = -amount;
            System.out.println("Remainnig balance : " + balance);

        } else {

            System.out.println(Thread.currentThread().getName() + " Inffusiant balance");

        }

    }

}

public class SyncronizedEx {

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        Thread t1 = new Thread(() -> b.withdraw(5000));

        Thread t2 = new Thread(()-> b.withdraw(6000));

        t1.start();
        t2.start();

    }

}
