package academy.devdojo.maratonajava.introduction;

public class Lesson02PrimitiveTypes {
    public static void main(String[] args) {
        /*
        * Primitive data types:
        * byte - 1 byte
        * short - 2 bytes
        * int - 4 bytes
        * long - 8 bytes
        * float - 4 bytes
        * double - 8 bytes
        * boolean - 1 bit
        * char - 2 bytes
        *
        * Non-primitive data types - String, Arrays, Classes
        * */
        int minimumDrivingAge = 16;
        int castNumber = (int) 10000000000L;
        long greatNumber = 100000L;
        double salaryDouble = 1000.0D;
        double scientificNumber1 = 89E3d;
        float salaryFloat = 15000F;
        float scientificNumber2 = 23e4f;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean older = true;
        boolean minor = false;
        char character = '\u0220';
        char firstLetter = 'F';
        char a = 20, b = 30, c = 40;
        String phrase = "My name is";
        String name = "Monkey D. Luffy";

        System.out.println("Minimum Driving Age is " + minimumDrivingAge + " years old!");
        System.out.println(castNumber);
        System.out.println(greatNumber);
        System.out.println(salaryDouble);
        System.out.println(scientificNumber1);
        System.out.println(salaryFloat);
        System.out.println(scientificNumber2);
        System.out.println(ageByte);
        System.out.println(ageShort);
        System.out.println(older);
        System.out.println(minor);
        System.out.println(character);
        System.out.println(firstLetter);
        System.out.println(a + b + c);
        System.out.println(phrase + " " + name);
    }
}
