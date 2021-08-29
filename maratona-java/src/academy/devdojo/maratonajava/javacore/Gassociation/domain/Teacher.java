package academy.devdojo.maratonajava.javacore.Gassociation.domain;

public class Teacher {
    private String name;
    private String specialty;
    private Seminary[] seminaries;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Teacher(String name, String specialty, Seminary[] seminaries) {
        this.name = name;
        this.specialty = specialty;
        this.seminaries = seminaries;
    }

    public void prints() {
        System.out.println("----- Teacher -----");
        System.out.println("Teacher: " + this.name);
        System.out.println("Specialty: " + this.specialty);
        if (this.seminaries == null) return;
        System.out.println("----- Registered seminaries -----");
        for (Seminary seminary : this.seminaries) {
            System.out.println("Title: " + seminary.getTitle());
            System.out.println("Local: " + seminary.getLocal().getAddress());
            if (seminary.getStudents() == null || seminary.getStudents().length == 0) continue;
            System.out.println("----- Students -----");
            for (Student student : seminary.getStudents()) {
                System.out.println("Name: " + student.getName() + " Age: " + student.getAge());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminary[] getSeminaries() {
        return seminaries;
    }

    public void setSeminaries(Seminary[] seminaries) {
        this.seminaries = seminaries;
    }
}
