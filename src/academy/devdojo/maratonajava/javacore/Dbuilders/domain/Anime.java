package academy.devdojo.maratonajava.javacore.Dbuilders.domain;

public class Anime {
    private String name;
    private String type;
    private String genre;
    private int episodes;

    public Anime(String name, String type, String genre, int episodes) {
        System.out.println("Inside constructor");
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    }

    public Anime() {

    }

    public void prints() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Genre: " + this.genre);
        System.out.println("Episodes: " + this.episodes);
        System.out.println();
    }
}
