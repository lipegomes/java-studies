package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int day = c.get((Calendar.DAY_OF_WEEK));
        if (c.getFirstDayOfWeek() == day){
            System.out.println("First day of week is SUNDAY");
        } else {
            System.out.println("Actual Day of Week: " + day);
        }
        Date date = c.getTime();
        System.out.println(date);
        System.out.println("Day of Week: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of Month: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of year: " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day of Week in Month: " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }
}
