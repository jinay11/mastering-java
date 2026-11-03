package collections;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Shraddha");
        names.add("Anushka");
        names.add("Rishita");
        names.add("Ali");
        names.add("Abrar");

//        System.out.println(names);

        //Access element
        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        //remove element
        System.out.println(names.removeFirst());
        System.out.println(names.removeLast());

        for(String name : names) {
            System.out.print(name + " ");
        }


        //LinkedList store a elements in linked node one so each node point to previous one.

    }
}
