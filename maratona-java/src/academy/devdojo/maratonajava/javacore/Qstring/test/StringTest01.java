package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name1 = "Ayrton"; // String constant pool
        String name2 = "Ayrton";
        name1 = name1.concat(" Senna");

        System.out.println(name1);
        System.out.println((name1).equals(name2));

        String name3 = new String("Ayrton");
        System.out.println(name2 == name3.intern());

        String name4 = new String("Schumacher");
        System.out.println(name3.equals(name4));
    }
}
