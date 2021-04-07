package academy.devdojo.maratonajava.javacore.EinitializationBlocks.test;

import academy.devdojo.maratonajava.javacore.EinitializationBlocks.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episodes : anime.getEpisodes()) {
            System.out.println(episodes + " ");
        }
    }
}
