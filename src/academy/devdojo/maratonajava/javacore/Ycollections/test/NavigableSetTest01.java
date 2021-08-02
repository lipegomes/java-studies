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
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator());
        Smartphone smartphone = new Smartphone("AZ87QE5RQ1","Xiaomi");
        set.add(smartphone);

        NavigableSet<Film> films = new TreeSet<>();
        films.add(new Film(2L, "Saving Private Ryan", 8.6f, 1998, "Drama, War", 169));
        films.add(new Film(1L, "The Pianist", 8.5f, 2002, "Biography, Drama, Music", 150));

        for (Film film : films) {
            System.out.println(film);
        }
    }
}
