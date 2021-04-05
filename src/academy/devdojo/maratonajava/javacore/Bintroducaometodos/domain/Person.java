package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Person {
    private String name;
    private int age;
    private String city;

    public void prints() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.city);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age !!!");
            return;
        }
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
