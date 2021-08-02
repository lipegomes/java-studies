package academy.devdojo.maratonajava.javacore.Ycollections.domain;

import java.util.Objects;

public class Film implements Comparable<Film>{
    private Long id;
    private String name;
    private float rate;
    private int release_year;
    private String genre;
    private int minutes;
    private Long votes;
    private float gross;

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

    public Film(Long id, String name, float rate, int release_year, String genre, int minutes, Long votes, float gross) {
        this(id, name, rate, release_year, genre, minutes);
        this.votes = votes;
        this.gross = gross;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Float.compare(film.rate, rate) == 0 && release_year == film.release_year && minutes == film.minutes && Float.compare(film.gross, gross) == 0 && id.equals(film.id) && name.equals(film.name) && Objects.equals(genre, film.genre) && Objects.equals(votes, film.votes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rate, release_year, genre, minutes, votes, gross);
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", release_year=" + release_year +
                ", genre='" + genre + '\'' +
                ", minutes=" + minutes +
                ", votes=" + votes +
                ", gross=" + gross +
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

    public Long getVotes() {
        return votes;
    }

    public void setVotes(Long votes) {
        this.votes = votes;
    }

    public float getGross() {
        return gross;
    }

    public void setGross(float gross) {
        this.gross = gross;
    }

    @Override
    public int compareTo(Film film) {
        // retorna negativo se o this < film
        if (this.id < film.getId()) {
            return -1;
        }
        // retorna 0 se this é == film
        else if (this.id.equals(film.getId())) {
            return 0;
        }
        // retorna positivo se this > film
        else {
            return +1;
        }
    }
}
