package skillValueTest;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class Test30 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime  = LocalTime.now(ZoneId.of("+02:00"));
        LocalDateTime localDateTime = localDate.atTime(localTime);
        Duration duration = Duration.of(5, ChronoUnit.MONTHS);
        localDateTime.plus(duration);
        System.out.println(localDateTime.atZone(ZoneOffset.UTC));
    }

}
