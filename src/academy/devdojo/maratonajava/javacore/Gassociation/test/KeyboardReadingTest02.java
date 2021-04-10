package academy.devdojo.maratonajava.javacore.Gassociation.test;

import java.util.Scanner;

public class KeyboardReadingTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your question and I will answer yes or no: ");
        String question = input.nextLine();
        if (question.charAt(0) == ' ') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
