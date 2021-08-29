package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args){
        LocalTime time = LocalTime.of(11, 15, 35, 234);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
        System.out.println();
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
        System.out.println(time.get(ChronoField.HOUR_OF_AMPM));
        System.out.println(time.get(ChronoField.AMPM_OF_DAY));
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
