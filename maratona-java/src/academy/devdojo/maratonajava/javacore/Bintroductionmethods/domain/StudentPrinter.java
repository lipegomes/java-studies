package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class StudentPrinter {
    public void prints(Student student) {
        System.out.println("---- * ----");

        System.out.println(("Name:" + student.name));
        System.out.println(("Age: " + student.age));
        System.out.println(("Gender: " + student.gender));
        System.out.println(("Music: " + student.music));
    }
}
