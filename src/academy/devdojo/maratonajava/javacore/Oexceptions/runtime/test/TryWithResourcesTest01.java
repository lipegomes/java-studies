package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

import academy.devdojo.maratonajava.javacore.Oexceptions.exception.domain.Reader1;
import academy.devdojo.maratonajava.javacore.Oexceptions.exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2();) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
