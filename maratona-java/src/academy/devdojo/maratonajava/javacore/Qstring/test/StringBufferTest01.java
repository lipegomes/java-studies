package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBufferTest01 {
    public static void main(String[] args) {
        String film = "The Godfather";
        film.concat(": Part II");
        film.substring(0, 4);
        System.out.println(film);
        StringBuffer sb = new StringBuffer("Vito Corleone in 1920s New York City ");
        sb.append("X.X").append("\n" +
                "Actors: 5 Stars\n" +
                "Direction: 5 Stars\n" +
                "Screenplay: 5 Stars");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 4);
        System.out.println(sb);
    }
}
