package gomes.filipe.exceptions;

import java.util.Random;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Random random = new Random();

        System.out.println("\n--- push an element ---");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + stack.push(random.nextInt(100)));
        }

        System.out.println("\n--- pop an element ---");
        for (int i = 0; i < 10; i++) {

            System.out.println(i + " -> " + stack.pop());
        }

        System.out.println("\n--- empty stack ---");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
