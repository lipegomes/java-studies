package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.DataBaseRepository;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.FileRepository;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.MemoryRepository;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository1 = new DataBaseRepository();
        Repository repository2 = new FileRepository();
        Repository repository3 = new MemoryRepository();

        repository1.save();
        repository2.save();
        repository3.save();
    }
}
