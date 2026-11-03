package collections;

import java.util.Map;

public class HashMap {

    public static void main(String[] args) {

        Map<Integer , String> students = new java.util.HashMap<>();

        students.put(101, "Rishita");
        students.put(102,"jon snow");
        students.put(103, "Anushka Jenson");

        //Get value

        System.out.println(students.get(101));

        //check key
        System.out.println(students.containsKey(102));

        //check value
        System.out.println(students.containsValue("jon snow"));

        System.out.println("size of : " + students.size());

        //remove
        System.out.println(students.remove(103));

        System.out.println(students);

    }

}
