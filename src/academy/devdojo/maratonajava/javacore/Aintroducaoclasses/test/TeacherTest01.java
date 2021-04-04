package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Filipe";
        teacher.age = 29;
        teacher.gender = 'M';
        teacher.discipline = "Physic";

        System.out.println("name: " + teacher.name);
        System.out.println("age: " + teacher.age);
        System.out.println("gender: " + teacher.gender);
        System.out.println("discipline: " + teacher.discipline);
    }
}
