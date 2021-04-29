package academy.devdojo.maratonajava.javacore.Oexceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest02 {
    public static void main(String[] args) throws IOException{
        createNewFile();
    }

    public static void createNewFile() throws IOException {
        File file = new File("file\\test2.txt");
        boolean newFile = file.createNewFile();
        System.out.println("Created new file " + newFile);
    }
}
