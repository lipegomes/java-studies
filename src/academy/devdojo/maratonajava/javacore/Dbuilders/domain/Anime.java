package academy.devdojo.maratonajava.javacore.Dbuilders.domain;

public class Anime {
    private String name;
    private String type;
    private String genre;
    private int episodes;
    private String studio;

    public Anime(String name, String type, String genre, int episodes) {
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    }

    public Anime(String name, String type, String genre, int episodes, String studio) {
        this(name, type, genre, episodes);
        this.studio = studio;
    }

    public Anime() {
        System.out.println("Inside the constructor without arguments");
    }

    public void prints() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Genre: " + this.genre);
        System.out.println("Episodes: " + this.episodes);
        System.out.println("Studio: " + this.studio);
        System.out.println();
    }
}
