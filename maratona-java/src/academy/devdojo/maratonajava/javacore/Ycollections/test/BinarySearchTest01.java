package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(1);
        numbers.add(4);
        numbers.add(8);
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(2);
        numbers.add(0);
        numbers.add(6);

        System.out.println("--- Sem ordenação ---");
        System.out.println(numbers);
        System.out.println("Posição número 0: " + Collections.binarySearch(numbers, 0));
        System.out.println("Posição número 1: " + Collections.binarySearch(numbers, 1));
        System.out.println("Posição número 2: " + Collections.binarySearch(numbers, 2));
        System.out.println("Posição número 3: " + Collections.binarySearch(numbers, 3));
        System.out.println("Posição número 4: " + Collections.binarySearch(numbers, 4));
        System.out.println("Posição número 5: " + Collections.binarySearch(numbers, 5));
        System.out.println("Posição número 6: " + Collections.binarySearch(numbers, 6));
        System.out.println("Posição número 7: " + Collections.binarySearch(numbers, 7));
        System.out.println("Posição número 8: " + Collections.binarySearch(numbers, 8));
        System.out.println("Posição número 9: " + Collections.binarySearch(numbers, 9));

        Collections.sort(numbers);
        System.out.println("--- Ordenado com sort ---");
        System.out.println(numbers);
        System.out.println("Posição número 0: " + Collections.binarySearch(numbers, 0));
        System.out.println("Posição número 1: " + Collections.binarySearch(numbers, 1));
        System.out.println("Posição número 2: " + Collections.binarySearch(numbers, 2));
        System.out.println("Posição número 3: " + Collections.binarySearch(numbers, 3));
        System.out.println("Posição número 4: " + Collections.binarySearch(numbers, 4));
        System.out.println("Posição número 5: " + Collections.binarySearch(numbers, 5));
        System.out.println("Posição número 6: " + Collections.binarySearch(numbers, 6));
        System.out.println("Posição número 7: " + Collections.binarySearch(numbers, 7));
        System.out.println("Posição número 8: " + Collections.binarySearch(numbers, 8));
        System.out.println("Posição número 9: " + Collections.binarySearch(numbers, 9));
    }
}
