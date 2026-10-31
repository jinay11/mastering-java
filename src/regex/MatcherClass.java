package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {

    public static void main(String[] args) {

        String text = "the cat and the cot sat on a cut mat" ;

        Pattern p = Pattern.compile("c.t");
        Matcher m = p.matcher(text);

        while(m.find()) {
            System.out.println("Found " + m.group() + " at position " + m.start());
        }

    }

}
