package academy.devdojo.maratonajava.introduction;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        * Widening Casting - automatically converting a smaller type to a larger type size
        * byte -> short -> char -> int -> long -> float -> double
        * */
        byte myByte = 7;
        short myShort = myByte;     // Automatic casting byte to short
        // char myChar = myShort;
        int myInt = myShort;    // Automatic casting byte to short
        long myLong = myInt;    // Automatic casting int to Long
        float myFloat = myLong; // Automatic casting long to float
        double myDouble = myFloat;  // Automatic casting float to double

        System.out.println("Widening Casting - automatically converting a smaller type to a larger type size:");
        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myLong: " + myLong);
        System.out.println("myFloat: " + myFloat);
        System.out.println("myDouble: " + myDouble);
        System.out.println();

        /*
        * Narrowing Casting - manually converting a larger type to a smaller size type
        * double -> float -> long -> int -> char -> short -> byte
        * */
        byte myByte2 = 88;
        short myShort2 = (short) myByte2;     // Manual casting byte to short
        char myChar2 = (char) myShort2; // Manual casting short to char
        int myInt2 = (int) myChar2;    // Manual casting byte to short
        long myLong2 = (long) myInt2;    // Manual casting int to Long
        float myFloat2 = (float) myLong2; // Manual casting long to float
        double myDouble2 = (double) myFloat2;  // Manual casting float to double

        System.out.println("Narrowing Casting - manually converting a larger type to a smaller size type:");
        System.out.println("myByte2: " + myByte2);
        System.out.println("myChar2: " + myChar2);
        System.out.println("myShort2: " + myShort2);
        System.out.println("myInt2: " + myInt2);
        System.out.println("myLong2: " + myLong2);
        System.out.println("myFloat2: " + myFloat2);
        System.out.println("myDouble2: " + myDouble2);
    }
}
