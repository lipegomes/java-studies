package academy.devdojo.maratonajava.javacore.Ycollections.domain;

import java.util.Objects;

public class Film implements Comparable<Film>{
    private Long id;
    private String name;
    private float rate;
    private int release_year;
    private String genre;
    private int minutes;

    public Film(Long id, String name, float rate, int release_year, String genre, int minutes) {
        Objects.requireNonNull(id, "Id não pode ser nulo");
        Objects.requireNonNull(name, "Name não pode ser nulo");
        Objects.requireNonNull(rate, "Rate não pode ser nulo");
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.release_year = release_year;
        this.genre = genre;
        this.minutes = minutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film films = (Film) o;
        return Float.compare(films.rate, rate) == 0 && release_year == films.release_year && minutes == films.minutes && id.equals(films.id) && name.equals(films.name) && genre.equals(films.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rate, release_year, genre, minutes);
    }

    @Override
    public String toString() {
        return "Films{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", release_year=" + release_year +
                ", genre='" + genre + '\'' +
                ", minutes=" + minutes +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public int compareTo(Film o) {
        // retorna negativo se o this < o
        if (this.id < o.getId()) {
            return -1;
        }
        // retorna 0 se this é == o
        else if (this.id.equals(o.getId())) {
            return 0;
        }
        // retorna positivo se this > o
        else {
            return +1;
        }
    }
}
