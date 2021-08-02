package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Film;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FilmIdComparator implements Comparator<Film> {

    @Override
    public int compare(Film film1, Film film2) {
        return film1.getId().compareTo(film2.getId());
    }
}

public class TestFilm01 {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film(1L, "The Godfather", 9.2f,1972, "Crime, Drama", 175));
        films.add(new Film(2L, "Lawrence of Arabia", 8.3f, 1962,"Adventure, Biography, Drama", 228));
        films.add(new Film(3L, "The Lord of the Rings: The Return of the King", 8.9f, 2003, "Action, Adventure, Drama", 201));
        films.add(new Film(4L, "Gladiator", 8.5f, 2000, "Action, Adventure, Drama", 155));
        films.add(new Film(5L, "Saving Private Ryan", 8.6f, 1998, "Drama, War", 169));
        films.add(new Film(6L, "The Pianist", 8.5f, 2002, "Biography, Drama, Music", 150));

        System.out.println("--- Ordenado por ordem posição no array ---");
        for (Film film : films) {
            System.out.println(film);
        }

        System.out.println();

        Collections.sort(films);
        System.out.println("--- Ordenado por sort em ordem númerica ---");
        for (Film film : films) {
            System.out.println(film);
        }

        System.out.println();

        Collections.sort(films, new FilmIdComparator());
        System.out.println("--- Ordenado usando comparator via Id ---");
        for (Film film : films) {
            System.out.println(film);
        }
    }
}
