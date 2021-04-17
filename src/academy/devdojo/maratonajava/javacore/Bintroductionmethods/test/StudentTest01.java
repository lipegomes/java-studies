package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Student;
import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter printer = new StudentPrinter();

        student01.name = "Clair";
        student01.age = 17;
        student01.gender = 'F';
        student01.music = "Pop";

        student02.name = "Scott";
        student02.age = 18;
        student02.gender = 'M';
        student02.music = "Rock and Roll";

        printer.prints(student01);
        printer.prints(student02);
    }
}
