package academy.devdojo.maratonajava.javacore.FstaticModifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    static {
        System.out.println("Inside the static initialization block 1");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Inside the static initialization block 2");
    }

    static {
        System.out.println("Inside the static initialization block 3");
    }

    {
        System.out.println("Inside the non static initialization block");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episodes : Anime.episodes) {
            System.out.print(episodes + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
