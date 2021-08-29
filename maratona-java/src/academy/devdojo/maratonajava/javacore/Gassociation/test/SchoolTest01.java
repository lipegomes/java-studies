package academy.devdojo.maratonajava.javacore.Gassociation.test;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.School;
import academy.devdojo.maratonajava.javacore.Gassociation.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher01 = new Teacher("Eikichi Onizuka");
        Teacher teacher02 = new Teacher("Jimmy Neutron");
        Teacher[] teachers = {teacher01, teacher02};
        School school01 = new School("Kichijoji", teachers);

        school01.prints();
    }
}
