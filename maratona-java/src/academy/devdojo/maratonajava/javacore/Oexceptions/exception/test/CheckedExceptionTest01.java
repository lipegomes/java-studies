package academy.devdojo.maratonajava.javacore.Oexceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest01 {
    public static void main(String[] args) {
        createNewFile();
    }

    public static void createNewFile() {
        File file = new File("file\\test.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println("Created new file " + newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
