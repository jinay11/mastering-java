package DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateTimeFormatte {
    public static void main(String[] args) {

        LocalDate d = LocalDate.now();

        DateTimeFormatter dt = new DateTimeFormatterBuilder()
                .appendLiteral("Today is : ")
                .appendPattern("dd-MM-yyyy")
                .toFormatter();

        System.out.println(d.format(dt));

    }
}
