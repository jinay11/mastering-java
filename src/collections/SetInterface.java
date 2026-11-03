package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("jon");
        names.add("smit");
        names.add("aarya");
        names.add("aarya"); //igoner because not allowed duplicate element
        names.add(null);
//        names.add(null); //store only one null value

        System.out.println(names);

        System.out.println(names.size());

        //TreeSet not null value , maintain a element as a sorted order , not duplicate

        Set<Integer> id = new TreeSet<>();
        id.add(105);
        id.add(101);
        id.add(101);
        id.add(103);
        id.add(100);
//        id.add(null);

        System.out.println(id);

        //LinkedHash set not duplicates , maintains a insertion order allow one null

        Set<Integer> marks = new LinkedHashSet<>();
        marks.add(null);
        marks.add(30);
        marks.add(45);
        marks.add(60);
        marks.add(11);

        System.out.println(marks);

    }

}
