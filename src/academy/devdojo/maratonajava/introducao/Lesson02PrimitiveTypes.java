package academy.devdojo.maratonajava.introducao;

public class Lesson02PrimitiveTypes {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int minimumDrivingAge = 16;
        int castNumber = (int) 10000000000L;
        long greatNumber = 100000L;
        double salaryDouble = 1000.0D;
        float salaryFloat = 15000F;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean older = true;
        boolean minor = false;
        char character = '\u0220';
        String phrase = "My name is";
        String name = "Monkey D. Luffy";

        System.out.println("Minimum Driving Age is " + minimumDrivingAge + " years old!");
        System.out.println(castNumber);
        System.out.println(greatNumber);
        System.out.println(salaryDouble);
        System.out.println(salaryFloat);
        System.out.println(ageByte);
        System.out.println(ageShort);
        System.out.println(older);
        System.out.println(minor);
        System.out.println(character);
        System.out.println(phrase + " " + name);
    }
}
