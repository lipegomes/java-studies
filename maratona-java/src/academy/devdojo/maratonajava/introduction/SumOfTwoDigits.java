package academy.devdojo.maratonajava.introduction;

import java.util.Scanner;

public class SumOfTwoDigits {
    static int sumOfDigits(int first_digit, int second_digit) {
        return first_digit + second_digit;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um número inteiro para a váriavel x: ");

        int x = num.nextInt();
        System.out.println("Digite um número inteiro para a váriavel y: ");
        int y = num.nextInt();
        System.out.println(x + " + " + y + " = " + sumOfDigits(x, y));
    }
}
