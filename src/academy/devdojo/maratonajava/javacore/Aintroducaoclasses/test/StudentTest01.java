package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Joseph";
        student.age = 68;
        student.gender = 'M';
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
