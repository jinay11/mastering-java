package Generics;

class Box<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

}

public class GenericsEx {
    public static void main(String[] args) {

        Box<String> b1 = new Box<>();

        b1.setValue("Generics in java");
        System.out.println(b1.getValue());

        //different data type
        Box<Integer> b2 = new Box<>();

        b2.setValue(101);
        System.out.println(b2.getValue());

    }
}
