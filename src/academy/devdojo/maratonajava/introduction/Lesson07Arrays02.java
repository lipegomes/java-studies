package academy.devdojo.maratonajava.introduction;

public class Lesson07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double
        // char '\u0000' ' '
        // boolean false
        // String null

        boolean[] ages = new boolean[3];
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        String[] cities = new String[5];
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        String[] names = new String[3];
        names[0] = "Anna";
        names[1] = "Barbara";
        names[2] = "Anastasia";

        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }
    }
}
