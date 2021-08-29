package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println();
        System.out.println("Mês: " + Month.SEPTEMBER.getValue());
        LocalDate date = LocalDate.of(2021, Month.SEPTEMBER, 18);
        LocalDate dateNow = LocalDate.now();
        System.out.println("Dia da semana: " +date.getDayOfMonth());
        System.out.println("Mês: " + date.getMonthValue());
        System.out.println("Ano: " + date.getYear());
        System.out.println("Era: " + date.getEra());
        System.out.println();
        System.out.println("Ano da era: " + date.get(ChronoField.YEAR_OF_ERA));
        System.out.println("Dia no mês: " + date.get(ChronoField.DAY_OF_MONTH));
        System.out.println("Mês: " + date.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("Ano: " + date.get(ChronoField.YEAR));
        System.out.println("Dia do ano: " + date.get(ChronoField.DAY_OF_YEAR));
        // Verifica se o ano é bissexto
        System.out.println("Ano é bissexto? " + date.isLeapYear());
        System.out.println();
        System.out.println(dateNow);
        // Data máxima que pode utilizar
        System.out.println(LocalDate.MAX);
        // Data mínima que pode utilizar
        System.out.println(LocalDate.MIN);
    }
}
