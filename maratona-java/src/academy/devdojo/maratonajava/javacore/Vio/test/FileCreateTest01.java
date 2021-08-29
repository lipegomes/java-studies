package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileCreateTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created? " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Path absolute: " + file.getAbsolutePath());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is hidden: " + file.isHidden());
            System.out.println("Can execute: " + file.canExecute());
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
