package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Pinepal");

        System.out.println(fruits);

        System.out.println(fruits.get(1));

        fruits.set(3,"Orange");

        System.out.println("after add the elements " + fruits);

//        fruits.remove(3);
        fruits.remove("Orange");

        System.out.println(fruits);

        System.out.println("Number of elements : " + fruits.size());

        System.out.println("Apple is exists : " + fruits.contains("Apple"));

    }
}
