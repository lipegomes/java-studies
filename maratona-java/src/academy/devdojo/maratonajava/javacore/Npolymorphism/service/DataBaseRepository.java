package academy.devdojo.maratonajava.javacore.Npolymorphism.service;

import academy.devdojo.maratonajava.javacore.Npolymorphism.repository.Repository;

public class DataBaseRepository implements Repository {

    @Override
    public void save() {
        System.out.println("Saving to the database");
    }
}
