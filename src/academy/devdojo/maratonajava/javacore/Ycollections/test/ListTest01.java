package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(10);
        names.add("Sergei");
        names.add("Rachmaninoff");

        for (String  name: names) {
            System.out.println(name);
        }
        System.out.println("-----");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
