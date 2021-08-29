package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Film;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Film> films = new HashSet<>();
        films.add(new Film(1L, "The Godfather", 9.2f,1972, "Crime, Drama", 175,  1_682_939L, 134.97f));
        films.add(new Film(2L, "The Lord of the Rings: The Return of the King", 8.9f, 2003, "Action, Adventure, Drama", 201, 1_691_247L, 377.85f));
        films.add(new Film(3L, "Gladiator", 8.5f, 2000, "Action, Adventure, Drama", 155, 1_383_672L, 187.71f));

        System.out.println("HashSet não mantém a ordem de inserção:");
        for (Film film : films) {
            System.out.println(film);
        }

        Set<Film> films2 = new LinkedHashSet<>();
        films2.add(new Film(1L, "The Godfather", 9.2f,1972, "Crime, Drama", 175,  1_682_939L, 134.97f));
        films2.add(new Film(2L, "The Lord of the Rings: The Return of the King", 8.9f, 2003, "Action, Adventure, Drama", 201, 1_691_247L, 377.85f));
        films2.add(new Film(3L, "Gladiator", 8.5f, 2000, "Action, Adventure, Drama", 155, 1_383_672L, 187.71f));

        System.out.println();

        System.out.println("LinkedHashSet mantém a ordem de inserção:");
        for (Film film : films2) {
            System.out.println(film);
        }
    }
}
