package academy.devdojo.maratonajava.javacore.Npolymorphism.service;

import academy.devdojo.maratonajava.javacore.Npolymorphism.repository.Repository;

public class MemoryRepository implements Repository {

    @Override
    public void save() {
        System.out.println("Saving to a memory");
    }
}
