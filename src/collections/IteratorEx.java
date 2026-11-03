package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();

        name.add("jon");
        name.add("Vikki");
        name.add("dev");
        name.add("Anushka");
        name.add("Cookie");

        Iterator<String> itr = name.iterator();

        while (itr.hasNext()) {

            String result = itr.next();
            System.out.println(result);

        }


    }
}
