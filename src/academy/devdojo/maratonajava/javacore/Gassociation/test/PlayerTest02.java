package academy.devdojo.maratonajava.javacore.Gassociation.test;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player01 = new Player("Ronaldinho Gaúcho");
        Team team01 = new Team("Barcelona");

        player01.setTeam(team01);
        player01.prints();
    }
}
