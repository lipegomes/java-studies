package academy.devdojo.maratonajava.javacore.Gassociation.test;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociation.domain.Seminary;
import academy.devdojo.maratonajava.javacore.Gassociation.domain.Student;
import academy.devdojo.maratonajava.javacore.Gassociation.domain.Teacher;

public class AssociationTest {
    public static void main(String[] args) {
        Local local = new Local("Bake Cook street");
        Student student1 = new Student("Margareth Owen", 19);
        Student student2 = new Student("Kate Johanssen", 20);
        Teacher teacher = new Teacher("Alberto Fernandez", "Macro and micronutrients");
        Student[] studentSeminary = {student1, student2};

        Seminary seminary = new Seminary("Gastronomy", studentSeminary, local);

        Seminary[] seminariesAvailable = {seminary};

        teacher.setSeminaries(seminariesAvailable);

        teacher.prints();
    }
}
