package oop;

public class ThisKeyword {

    int age;

    void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        ThisKeyword tk = new ThisKeyword();
        tk.setAge(21);
        System.out.println("The age : " + tk.age);

    }

}
