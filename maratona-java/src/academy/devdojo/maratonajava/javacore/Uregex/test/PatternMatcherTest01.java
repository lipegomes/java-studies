package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "abaodhtaayteootrpsaqsddsdbqbbaaba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text:   " + text);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas:");
        while (matcher.find()) {
            System.out.println(matcher.start() + " ");
        }

        System.out.println();

        String regex2 = "aba";
        String text2 = "ababababababab";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(text2);
        System.out.println("Text:   " + text2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex2);
        System.out.println("Posições encontradas:");
        while (matcher2.find()) {
            System.out.println(matcher2.start() + " ");
        }

    }
}
