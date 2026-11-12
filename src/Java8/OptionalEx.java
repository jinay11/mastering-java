package Java8;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {

        Optional<String> student = Optional.ofNullable(null);

        String result = student.orElse("Student Not Found");

        System.out.println(result);

    }
}
