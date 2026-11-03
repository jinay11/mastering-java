package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {

    public static void main(String[] args) {

        Collection<String> toys = new ArrayList<>();

        toys.add("car");
        toys.add("doll");
        toys.add("Apple");

        System.out.println("Size of toys box : " + toys.size());
        System.out.println("box are empty ? : " + toys.isEmpty());
        System.out.println("box contain  a car : " + toys.contains("car"));

        toys.remove("Apple");
        toys.add("ball");

        for (String toy : toys) {
            System.out.println(toy);
        }

    }

}
