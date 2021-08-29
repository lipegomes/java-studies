package academy.devdojo.maratonajava.javacore.Ycollections.test;

public class EqualsTest01 {
    public static void main(String[] args) {
        String name = "Ayrton Senna";
        String name2 = new String("Ayrton Sena");
        System.out.println(name + " é igual a " + name2 + ": " + name.equals(name2));
    }
}
