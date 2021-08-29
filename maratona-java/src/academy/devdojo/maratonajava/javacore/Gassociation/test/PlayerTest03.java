package academy.devdojo.maratonajava.javacore.Gassociation.test;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player01 = new Player("Zico");
        Player player02 = new Player("Cristiano Ronaldo");
        Team team01 = new Team("Flamengo");
        Team team02 = new Team("Juventus");
        Player[] players = {player01, player02};

        player01.setTeam(team01);
        player02.setTeam(team02);

        team01.setPlayers(players);
        team02.setPlayers(players);

        System.out.println("--- Players ---");

        player01.prints();
        System.out.println();
        player02.prints();

        System.out.println("--- Teams ---");

        team01.prints();
        System.out.println();
        team02.prints();
    }
}
