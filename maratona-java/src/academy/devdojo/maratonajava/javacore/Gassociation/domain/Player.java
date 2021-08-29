package academy.devdojo.maratonajava.javacore.Gassociation.domain;

public class Player {
    private String name;
    public Team team;

    public void prints() {
        System.out.println("Name: " + this.name);
        if (team != null) {
            System.out.println("Team: " + team.getName());
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
