package regex;

public class CharacterClass {

    public static void main(String[] args) {

        //character class allows to pattern match one character to specified set.

        String input = "abc123";

//        System.out.println(input.matches(".[a-z]+.*"));

        String regex = "[abc]";
//        System.out.println("a".matches(regex));

        String range = "[0-9]";
//        System.out.println("5".matches(range));

        String multiRange = "[a-zA-Z0-9]";
        System.out.println("A".matches(multiRange));
        System.out.println("7".matches(multiRange));
        System.out.println("@".matches(multiRange));

    }

}
