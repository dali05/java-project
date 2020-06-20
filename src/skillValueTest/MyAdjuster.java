package skillValueTest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public  class MyAdjuster implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        int x = temporal.get(ChronoField.DAY_OF_WEEK);
        int y = 1;
        if(x == DayOfWeek.FRIDAY.getValue()) y = 3;
        if(x == DayOfWeek.SATURDAY.getValue()) y = 2;
        return temporal.plus(y, ChronoUnit.DAYS);
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(ZoneId.of("Australia/Sydney"));
        localDate = localDate.with(new MyAdjuster());
        System.out.println(localDate);
    }

}

