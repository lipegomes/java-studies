package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        System.out.println("Lista de números inteiros: " + numbers);

        // Converte uma lista de números inteiros para um array de números inteiros
        Integer[] listToArray = numbers.toArray(new Integer[0]);
        System.out.println("Array de números inteiros: " + Arrays.toString(listToArray));

        Integer[] numbersArray = new Integer[10];
        numbersArray[0] = 10;
        numbersArray[1] = 11;
        numbersArray[2] = 12;
        numbersArray[3] = 13;
        numbersArray[4] = 14;
        numbersArray[5] = 15;
        numbersArray[6] = 16;
        numbersArray[7] = 17;
        numbersArray[8] = 18;
        numbersArray[9] = 19;

        // Converte um array de números inteiros para uma lista de números inteiros
        List<Integer> arrayToList = new ArrayList<>(Arrays.asList(numbersArray));
        System.out.println("Lista de números inteiros: "+ arrayToList);

        List<String> fibonacciString = Arrays.asList("0","1", "1", "2", "3", "5", "8", "13", "21", "34", "55", "89", "144","...");
        System.out.println("Sequência de Fibonacci: " + fibonacciString);
    }
}
