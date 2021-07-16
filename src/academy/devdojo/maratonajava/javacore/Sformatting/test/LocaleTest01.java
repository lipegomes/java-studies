package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localePoland = new Locale("pl", "PL");
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeUS = new Locale("en-us", "US");
        Locale localeSwitzerland = new Locale("deu", "CH");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeChina = new Locale("cn", "CN");
        Locale localeCanada = new Locale("ca", "CA");
        Locale localeSweden = new Locale("se", "SE");
        Locale localeRussia = new Locale("ru", "RU");
        Locale localeEgypt = new Locale("eg", "EG");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localePoland);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeUS);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeChina);
        DateFormat df7 = DateFormat.getDateInstance(DateFormat.FULL, localeCanada);
        DateFormat df8 = DateFormat.getDateInstance(DateFormat.FULL, localeSweden);
        DateFormat df9 = DateFormat.getDateInstance(DateFormat.FULL, localeRussia);
        DateFormat df10 = DateFormat.getDateInstance(DateFormat.FULL, localeEgypt);

        System.out.println("Poland " + df1.format(calendar.getTime()));
        System.out.println("Brazil " + df2.format(calendar.getTime()));
        System.out.println("United States " + df3.format(calendar.getTime()));
        System.out.println("Switzerland " + df4.format(calendar.getTime()));
        System.out.println("Japan " + df5.format(calendar.getTime()));
        System.out.println("China " + df6.format(calendar.getTime()));
        System.out.println("Canada " + df7.format(calendar.getTime()));
        System.out.println("Sweden " + df8.format(calendar.getTime()));
        System.out.println("Russia " + df9.format(calendar.getTime()));
        System.out.println("Egypt " + df10.format(calendar.getTime()));

        System.out.println(localePoland.getDisplayCountry(localePoland));
        System.out.println(localeBrazil.getDisplayCountry(localeBrazil));
        System.out.println(localeUS.getDisplayCountry(localeUS));
        System.out.println(localeSwitzerland.getDisplayCountry(localeSwitzerland));
        System.out.println(localeJapan.getDisplayCountry(localeJapan));
        System.out.println(localeChina.getDisplayCountry(localeChina));
        System.out.println(localeCanada.getDisplayCountry(localeCanada));
        System.out.println(localeSweden.getDisplayCountry(localeSweden));
        System.out.println(localeRussia.getDisplayCountry(localeRussia));
        System.out.println(localeEgypt.getDisplayCountry(localeEgypt));
    }
}
