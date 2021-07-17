package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeKorea = Locale.KOREA;
        Locale localeFrance = Locale.FRANCE;
        Locale localeGerman = Locale.GERMAN;
        Locale localeJapan = Locale.JAPAN;
        Locale localeChina = Locale.CHINA;
        NumberFormat[] nfa = new NumberFormat[7];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBrazil);
        nfa[2] = NumberFormat.getInstance(localeKorea);
        nfa[3] = NumberFormat.getInstance(localeFrance);
        nfa[4] = NumberFormat.getInstance(localeGerman);
        nfa[5] = NumberFormat.getInstance(localeJapan);
        nfa[6] = NumberFormat.getInstance(localeChina);
        double valor = 11_465.6789;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
