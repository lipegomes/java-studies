package academy.devdojo.maratonajava.javacore.CmethodOverloading.domain;

public class Anime {
    private String name;
    private String type;
    private String genre;
    private int episodes;

    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    public void init(String name, String type, String genre, int episodes) {
        this.init(name, type, episodes);
        this.genre = genre;
    }

    public void prints() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Genre: " + this.genre);
        System.out.println("Episodes: " + this.episodes);
        System.out.println();
    }
}
