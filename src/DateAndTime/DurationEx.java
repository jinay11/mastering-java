package DateAndTime;

import java.time.Duration;

public class DurationEx {
    public static void main(String[] args) {

        //Duration caculates difference between time

        Duration d = Duration.ofMinutes(10);

        System.out.println("Minutes : " + d.toMinutes());
        System.out.println("seconds : " + d.toSeconds());

    }
}
