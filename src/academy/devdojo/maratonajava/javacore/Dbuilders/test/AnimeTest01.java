package academy.devdojo.maratonajava.javacore.Dbuilders.test;

import academy.devdojo.maratonajava.javacore.Dbuilders.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime("Hunter x Hunter", "TV", "Animation / Action / Adventure", 148);
        Anime anime02 = new Anime("Steins;Gate 0", "Crunchyroll", "Animation / Drama / Mystery", 24);
        Anime anime03 = new Anime();
        anime01.prints();
        anime02.prints();
        anime03.prints();
    }
}
