package academy.devdojo.maratonajava.introduction;

public class Operators {
    public static void main(String[] args) {
        double x = 10;
        double y = 5;

        // Arithmetic operators
        // Addition
        double myAddition = x + y;
        System.out.println("myAddition: " + myAddition);
        // Subtraction
        double mySubtraction = x - y;
        System.out.println("mySubtraction: " + mySubtraction);
        // Multiplication
        double myMultiplication = x * y;
        System.out.println("myMultiplication: " + myMultiplication);
        // Division
        double myDivision = x / y;
        System.out.println("myDivision: " + myDivision);
        // Modulus
        double myModulus = x % y;
        System.out.println("myModulus: " + myModulus);
        // Increment
        ++x;
        System.out.println("Increment: " + x);
        // Decrement
        --y;
        System.out.println("Decrement: " + y);
        // Assignment operators
        x = 100;
        System.out.println(x);
        x += 200;
        System.out.println(x);
        x -= 150;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x /= 4;
        System.out.println(x);
        x %= 2;
        System.out.println(x);

        int z = 3;
        z &= 2;
        System.out.println(z);

        z |= 5;
        System.out.println(z);

        z ^= 2;
        System.out.println(z);

        z >>= 125;
        System.out.println(z);

        z <<= 28;
        System.out.println(z);

        // Comparison operators
        // Equal to
        System.out.println(x == y);
        //  Not equal
        System.out.println(x != y);
        // Greater than
        System.out.println(x > y);
        // Less than
        System.out.println(x < y);
        // Greater than or equal to
        System.out.println(x >= y);
        //  Less than or equal to
        System.out.println(x <= y);

        // Logical operators
        // Logical and
        System.out.println(x < 2 &&  x < 10);
        // Logical or
        System.out.println(x < 7 || x < 234);
        // Logical not
        System.out.println(!(x < -1 && x < 10000));

        // Bitwise operators
        // Initial values
        int a = 8;
        int b = 12;
        // bitwise and
        System.out.println("a&b = " + (a & b));
        // bitwise or
        System.out.println("a|b = " + (a | b));
        // bitwise xo
        System.out.println("a^b = " + (a ^ b));
        // bitwise not
        System.out.println("~a = " + ~a);
        a &= b;
        System.out.println("a= " + a);
    }
}
