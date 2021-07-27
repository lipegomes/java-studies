package academy.devdojo.maratonajava.javacore.test;

import java.io.File;

public class FileDeleteTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isDeleted = file.delete();
            System.out.println("Deleted file? " + isDeleted);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
