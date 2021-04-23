package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Loading data from a database....");
    }
}
