package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Film;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film(1L, "The Godfather", 9.2f,1972, "Crime, Drama", 175,  1_682_939L, 134.97f));
        films.add(new Film(2L, "The Lord of the Rings: The Return of the King", 8.9f, 2003, "Action, Adventure, Drama", 201, 1_691_247L, 377.85f));
        films.add(new Film(3L, "Gladiator", 8.5f, 2000, "Action, Adventure, Drama", 155, 1_383_672L, 187.71f));
        films.add(new Film(4L, "Removing gross zero", 10f, 2021, "Test", 1, 1L, 0));

        System.out.println("--- Lista de filmes ---");
        System.out.println(films);

        Iterator<Film> filmIterator = films.iterator();
        while(filmIterator.hasNext()) {
            if (filmIterator.next().getGross() == 0) {
                filmIterator.remove();
            }
        }
        System.out.println("--- Lista de filmes com remoção de gross com valor 0 --- ");
        System.out.println(films);

        films.removeIf(film -> film.getGross() < 300f);
        System.out.println("--- List de filmes com remoçãoi de gross com valor menor que $300M ---");
        System.out.println(films);
    }
}
