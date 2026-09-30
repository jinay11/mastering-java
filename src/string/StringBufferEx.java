package string;

public class StringBufferEx {

    public static void main(String[] args) {

        System.out.println("StringBuffer is a mutable");

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println(sb);

        sb.append(" World");

        System.out.println("new modify text is :  " + sb);

        //insert add a text on specific index
        sb.insert(11, " Java");
        System.out.println("insert text : " + sb);

        //delete remove the text under the index
        sb.delete(12,16);
        System.out.println("after deletion : " + sb);

        //revers the text
        sb.reverse();
        System.out.println("Reverse the text : " + sb);



    }

}
