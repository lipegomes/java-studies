package academy.devdojo.maratonajava.javacore.Pwrappers.Test;

public class WrapperTest01 {
    public static void main(String[] args) {
        // Primitive Types
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'F';
        boolean booleanP = false;

        // Wrapper - Classes representing primitive types
        // Autoboxing
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'F';
        Boolean booleanW = false;

        // Unboxing
        int i = intW;
        Integer intW2 = Integer.parseInt("10");
        Double intW3 = Double.parseDouble("25.4");
        boolean brazil = Boolean.parseBoolean("TruE");

        System.out.println(brazil);
        System.out.println(Character.isDigit('B'));
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('d'));
        System.out.println(Character.isLetter('5'));
        System.out.println(Character.toUpperCase('e'));
        System.out.println(Character.toLowerCase('T'));
    }
}
