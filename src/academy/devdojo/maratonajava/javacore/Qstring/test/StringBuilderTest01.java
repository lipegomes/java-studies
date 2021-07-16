package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String film = "The Godfather";
        film.concat(": Part II");
        System.out.println(film);
        StringBuilder sb = new StringBuilder("Vito Corleone in 1920s New York City ");
        sb.append("X.X");
        System.out.println(sb);
    }
}
