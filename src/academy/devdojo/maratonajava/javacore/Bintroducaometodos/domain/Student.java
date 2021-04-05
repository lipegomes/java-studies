package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Student {
    public String name;
    public int age;
    public char gender;
    public String music;

    public void prints(){
        System.out.println("--------");
        System.out.println("Name: " + this.name);
        System.out.println("Age: "+ this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Music: " + this.music);
    }
}
