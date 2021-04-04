package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Marry";
        student1.age = 22;
        student1.gender = 'F';

        student2.name = "Clarissa";
        student2.age = 19;
        student2.gender = 'F';

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gender);

        System.out.println("-----------------");

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gender);


    }
}
