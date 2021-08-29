package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Fruits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitsTest01 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Coconut");
        fruits.add("Feijoa");
        fruits.add("Papaya");
        fruits.add("Mulberry");
        fruits.add("Jackfruit");
        fruits.add("Açaí");
        fruits.add("Mango");
        fruits.add("Tomato");
        fruits.add("Pea");
        fruits.add("Salak");
        fruits.add("Yuzu");

        // sort - ordena a lista em ordem alfabética ou numérica
        Collections.sort(fruits);
        System.out.println("ArrayList ordenado com sort: " + fruits);

        System.out.println("Frutas:");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        Fruits fruit = new Fruits(123L, "Banana", "Plantae", "Musaceae", "Musa");
        System.out.println(fruit);
    }
}
