package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsEx {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70);

        List<Integer> result = numbers.stream().filter(n -> n > 30).collect(Collectors.toList());

        System.out.println(result);

    }

}
