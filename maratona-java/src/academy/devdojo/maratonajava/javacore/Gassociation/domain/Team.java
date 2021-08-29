package academy.devdojo.maratonajava.javacore.Gassociation.domain;

public class Team {
    private String name;
    private Player[] players;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public void prints() {
        System.out.println("Name: " + this.name);
        if (players == null) {
            return;
        }
        for (Player player : players) {
            System.out.println("Player: " + player.getName());
        }
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
