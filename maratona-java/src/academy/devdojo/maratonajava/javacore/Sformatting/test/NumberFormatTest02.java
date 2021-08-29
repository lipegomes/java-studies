package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeKorea = Locale.KOREA;
        Locale localeFrance = Locale.FRANCE;
        Locale localeGerman = Locale.GERMAN;
        Locale localeJapan = Locale.JAPAN;
        Locale localeChina = Locale.CHINA;
        NumberFormat[] nfa = new NumberFormat[7];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeBrazil);
        nfa[2] = NumberFormat.getCurrencyInstance(localeKorea);
        nfa[3] = NumberFormat.getCurrencyInstance(localeFrance);
        nfa[4] = NumberFormat.getCurrencyInstance(localeGerman);
        nfa[5] = NumberFormat.getCurrencyInstance(localeJapan);
        nfa[6] = NumberFormat.getCurrencyInstance(localeChina);
        double valor = 11_465.6789;
        for (NumberFormat numberFormat : nfa) {
            System.out.println("get Maximum Fraction Digits: " + numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }
        //        String money = "1,000";
        //        try {
        //            System.out.println(nfa[0].parse(money));
        //        } catch (ParseException e) {
        //            e.printStackTrace();
        //        }
    }
}
