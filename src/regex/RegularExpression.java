package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\d{3}-\\d{4}");
        Matcher matcher = pattern.matcher("call 555-1234 or 777-8912");

        while(matcher.find()) {
            System.out.println("Found : " + matcher.group() + " at " + matcher.start());
        }


    }
}
