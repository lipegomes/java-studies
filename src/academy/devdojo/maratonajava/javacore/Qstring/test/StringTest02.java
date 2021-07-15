package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String city = "London";
        String letters = " abcdefgh ";
        String numbers = "0123456789";
        System.out.println(city.charAt(0));
        System.out.println(city.charAt(1));
        System.out.println(city.charAt(2));
        System.out.println(city.charAt(3));
        System.out.println(city.charAt(4));
        System.out.println(city.charAt(5));
        System.out.println(city.length());
        System.out.println(city.replace("o", "u"));
        System.out.println(city.toLowerCase());
        System.out.println(city.toUpperCase());
        System.out.println(numbers.substring(0,3));
        System.out.println(numbers.length());
        System.out.println(numbers.substring(0, numbers.length()));
        System.out.println(numbers.substring(4, numbers.length()));
        System.out.println(letters.trim());
    }
}
