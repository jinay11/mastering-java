package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateAndTime {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        //stores the both
        LocalDateTime both = LocalDateTime.now();
        System.out.println(both);

    }

}
