package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String people = "Anna, Maria, Joaquina";
        String[] names = people.split(",");
        for (String name : names) {
            System.out.println(name.trim());
        }
    }
}
