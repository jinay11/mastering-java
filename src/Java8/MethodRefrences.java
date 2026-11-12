package Java8;

import java.util.Arrays;
import java.util.List;

public class MethodRefrences {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ram","jon","shita");

        //using lambda
        names.forEach(name -> System.out.println(name));


        //using method refrences
        names.forEach(System.out::println);

    }
}
