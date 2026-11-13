package DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodEx {
    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2020, 3 , 25);
        LocalDate end = LocalDate.now();

        Period p = Period.between(start, end);

        System.out.println("Years : " + p.getYears());
        System.out.println("Months : " + p.getMonths());
        System.out.println("Days : " + p.getDays());

    }
}
