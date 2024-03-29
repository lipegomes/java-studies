package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemove {
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Loading data from a database....");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from the database....");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in the database...");
    }


    public static void retrieveMaxDataSize() {
        System.out.println("Inside retrieveMaxDataSize in the DataBaseLoader class");
    }
}
