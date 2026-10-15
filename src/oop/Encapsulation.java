package oop;

class BankAccount {

    private double balance = 1000.00;

    public double getBalance() {
        return balance;
    }

    public void deposite(double amount){
        if (amount > 0) {
            balance = balance + amount;
        }
    }

}

public class Encapsulation {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();
        System.out.println("Your balance is : " + acc.getBalance());
        acc.deposite(2000);
        System.out.println("after deposite your balance is " + acc.getBalance());

    }

}
