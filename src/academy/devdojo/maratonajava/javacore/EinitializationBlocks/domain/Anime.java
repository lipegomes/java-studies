package academy.devdojo.maratonajava.javacore.EinitializationBlocks.domain;

public class Anime {
    private String name;
    private int[] episodes;

    {
        System.out.println("Inside initialization block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episodes : this.episodes) {
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
