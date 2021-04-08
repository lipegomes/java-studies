package academy.devdojo.maratonajava.javacore.Gassociation.test;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player01 = new Player("Ronaldinho Gaucho");
        Player player02 = new Player("Zidane");
        Player player03 = new Player("Pirlo");
        Player player04 = new Player("Kaka");
        Player player05 = new Player("Seedorf");
        Player player06 = new Player("Garrincha");
        Player player07 = new Player("Adriano");
        Player player08 = new Player("Zico");

        Player[] players = {player01, player02, player03, player04, player05, player06, player07, player08};
        for (Player player : players) {
            player.prints();
        }
    }
}
