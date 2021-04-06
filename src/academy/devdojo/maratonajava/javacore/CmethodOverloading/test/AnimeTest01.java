package academy.devdojo.maratonajava.javacore.CmethodOverloading.test;

import academy.devdojo.maratonajava.javacore.CmethodOverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime();
        Anime anime02 = new Anime();
        Anime anime03 = new Anime();
        Anime anime04 = new Anime();
        Anime anime05 = new Anime();

        anime01.init("One Punch Man", "Netflix", 25);
        anime02.init("Bleach", "TV", "Action / Adventure", 380);
        anime03.init("The Promised Neverland", "Crunchyroll", "Adventure / Drama", 23);
        anime04.init("Hunter x Hunter", "TV", "Animation / Action / Adventure", 148);
        anime05.init("Steins;Gate 0", "Crunchyroll", "Animation / Drama / Mystery", 24);


        anime01.prints();
        anime02.prints();
        anime03.prints();
        anime04.prints();
        anime05.prints();
    }
}
