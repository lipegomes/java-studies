package academy.devdojo.maratonajava.Vio.test;

import java.io.File;

public class FileDeleteTest02 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted file? " + file.delete());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
