package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
       LocalDateTime localDateTime = LocalDateTime.now();
       LocalDate date = LocalDate.of(2027, Month.MARCH, 19);
       LocalTime time = LocalTime.of(7, 28, 33, 219876534);
       System.out.println(localDateTime);
       System.out.println(date);
       System.out.println(time);

       LocalDateTime ldt1 = date.atTime(time);
       LocalDateTime ldt2 = date.atTime(11, 49, 0);
       LocalDateTime ldt3 = time.atDate(date);
       System.out.println(ldt1);
       System.out.println(ldt2);
       System.out.println(ldt3);
    }
}
