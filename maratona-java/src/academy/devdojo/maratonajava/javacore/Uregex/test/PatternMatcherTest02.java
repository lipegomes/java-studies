package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // . -> encontra a instância de qualquer carácter(character)
        String regex = ".j";
        String text = "abac22atej2abutica3ba114ba0nab4aa6bencoado";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text:   " + text);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas:");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + "\n");
        }

        // ^ -> encontra uma correspondência no INÍCIO de uma string
        String regex2 = "^c";
        String text2 = "carambolamelanciafeijaoarrozazeiotoonamanga";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(text2);
        System.out.println("Text:   " + text2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex2);
        System.out.println("Posições encontradas:");
        while (matcher2.find()) {
            System.out.println(matcher2.start() + " " + matcher2.group() + "\n");
        }

        // $ -> encontra uma correspondência no FINAL de uma string
        String regex3 = "$";
        String text3 = "lagoaserradesertosertaoagrestenevesol";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(text3);
        System.out.println("Text:   " + text3);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex3);
        System.out.println("Posições encontradas:");
        while (matcher3.find()) {
            System.out.println(matcher3.start() + " " + matcher3.group() + "\n");
        }

        // \d -> encontra um dígito
        String regex4 = "\\d";
        String text4 = "ter3hoj21m2849mz";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(text4);
        System.out.println("Text:   " + text4);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex4);
        System.out.println("Posições encontradas:");
        while (matcher4.find()) {
            System.out.println(matcher4.start() + " " + matcher4.group() + "\n");
        }

        // \s -> encontra um carácter de um espaço em branco \t \n \f \r
        String regex5 = "\\s";
        String text5 = "U%8(#12\trsO\tp$";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(text5);
        System.out.println("Text:   " + text5);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex5);
        System.out.println("Posições encontradas:");
        while (matcher5.find()) {
            System.out.println(matcher5.start() + " " + matcher5.group() + "\n");
        }

        // \S -> encontra todos os  carácteres excluindo os brancos
        String regex6 = "\\S";
        String text6 = "Uma frase aleatória qualquer";
        Pattern pattern6 = Pattern.compile(regex6);
        Matcher matcher6 = pattern6.matcher(text6);
        System.out.println("Text:   " + text6);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex6);
        System.out.println("Posições encontradas:");
        while (matcher6.find()) {
            System.out.println(matcher6.start() + " " + matcher6.group() + "\n");
        }

        // \b -> encontra uma correspondência no INÍCIO ou no FINAL de uma palavra
        String regex7 = "\\So";
        String text7 = "Primavera não é verão";
        Pattern pattern7 = Pattern.compile(regex7);
        Matcher matcher7 = pattern7.matcher(text7);
        System.out.println("Text:   " + text7);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex7);
        System.out.println("Posições encontradas:");
        while (matcher7.find()) {
            System.out.println(matcher7.start() + " " + matcher7.group() + "\n");
        }

        // \w -> exclui os carácteres especiais mantendo somente letras
        String regex8 = "\\w";
        String text8 = "!@bra$si|l";
        Pattern pattern8 = Pattern.compile(regex8);
        Matcher matcher8 = pattern8.matcher(text8);
        System.out.println("Text:   " + text8);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex8);
        System.out.println("Posições encontradas:");
        while (matcher8.find()) {
            System.out.println(matcher8.start() + " " + matcher8.group() + "\n");
        }

        // \w -> exclui as letras mantendo somente os carácteres especiais
        String regex9 = "\\W";
        String text9 = "!@bra$si|l";
        Pattern pattern9 = Pattern.compile(regex9);
        Matcher matcher9 = pattern9.matcher(text9);
        System.out.println("Text:   " + text9);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex9);
        System.out.println("Posições encontradas:");
        while (matcher9.find()) {
            System.out.println(matcher9.start() + " " + matcher9.group() + "\n");
        }
    }
}
