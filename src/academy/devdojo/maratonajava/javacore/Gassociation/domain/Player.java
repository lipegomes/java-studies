package academy.devdojo.maratonajava.javacore.Gassociation.domain;

public class Player {
    private String name;

    public void prints() {
        System.out.println(this.name);
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
