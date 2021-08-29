package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Petter";
        student01.age = 60;
        student01.gender = 'M';
        student01.music = "Classic";

        student02.name = "Jenny";
        student02.age = 42;
        student02.gender = 'F';
        student02.music = "Caribbean";

        student01.prints();
        student02.prints();
    }
}
