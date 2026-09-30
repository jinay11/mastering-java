package string;

public class StringBuilderEX {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        System.out.println("original String : " + sb);

        //apped is used for adding text
        sb.append(" by copilot");
        System.out.println("appendend text : " + sb);

        //insert add a something at specific position
        sb.insert(15, "!!!");
        System.out.println("inserted text : " + sb);

        //delete remove the charcter
        sb.delete(17,18);
        System.out.println("after deletion process : " + sb);

        //reverse the text using reverse method
        sb.reverse();
        System.out.println("reverse : " + sb);

        //StringBuilder is mutalbe and non-thread safe Generally faster

    }

}