package ExceptionHandling;

import java.util.Optional;

public class NullPointerException {

    public static void main(String[] args) {

        String name = null;
//        String name = "Jinay";

        System.out.println(name.length());

//        if(name != null) {
//            System.out.println(name.length());

//        }else{
//            System.out.println("Null Pointer Exception can not invoke String.length() because name is null");
//        }

//        Optional<String> name = Optional.ofNullable(getName());
//        System.out.println(name.orElse("Unknown"));

    }

}
