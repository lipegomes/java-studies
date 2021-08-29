package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Film;
import academy.devdojo.maratonajava.javacore.Ycollections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneBrandComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
        return smartphone1.getBrand().compareTo(smartphone2.getBrand());
    }
}

class FilmRateComparator implements Comparator<Film> {

    @Override
    public int compare(Film film1, Film film2) {
        return Float.compare(film1.getRate(), film2.getRate());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator());
        Smartphone smartphone = new Smartphone("AZ87QE5RQ1","Xiaomi");
        set.add(smartphone);

        NavigableSet<Film> films = new TreeSet<>(new FilmRateComparator());
        films.add(new Film(5L, "Big Hero 6", 7.8f, 2014, "Animation, Action, Adventure", 102,  424_555L, 222.53f));
        films.add(new Film(2L, "Spirited Away", 8.6f, 2001, "Animation, Adventure, Family", 125,  682_506L, 10.06f));
        films.add(new Film(3L, "Toy Story 3", 8.2f, 2010, "Animation, Adventure, Comedy", 103,  778_139L, 415.0f));
        films.add(new Film(1L, "Your Name", 8.4f, 2016, "Animation, Drama, Fantasy", 106,  217_234L, 5.02f));

        System.out.println("--- Sem ordenação ---");
        for (Film film : films) {
            System.out.println(film);
        }

        Film zootopia = new Film(4L, "Zootopia", 8f, 2016, "Animation, Adventure, Comedy", 108,  452_150L, 341.27f);

        System.out.println("\n--- Ordenado por lower ---");
        System.out.println(films.lower(zootopia));

        System.out.println("\n--- Ordenado por floor ---");
        System.out.println(films.floor(zootopia));

        System.out.println("\n--- Ordenado por higher ---");
        System.out.println(films.higher(zootopia));

        System.out.println("\n--- Ordenado por ceiling ---");
        System.out.println(films.ceiling(zootopia));
    }
}
