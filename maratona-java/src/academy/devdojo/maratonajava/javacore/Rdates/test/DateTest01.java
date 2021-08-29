package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();
        date.toInstant();
        // Print date and time in real time
        System.out.println(date);
        // Print date and time + 3_600_000 ms
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
