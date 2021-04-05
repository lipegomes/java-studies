package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Employee {
    public String name;
    public int age;
    public String occupation;
    public double[] wages;


    public void prints() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.occupation);
        if (wages == null) {
            return;
        }
        for (double wage : wages) {
            System.out.print("$" + wage + " ");
        }

//        averageWage();
    }

    public void averageWage() {
        if (wages == null) {
            return;
        }
        double average = 0;

        for (double wage : wages) {
            average += wage;
        }
        average /= wages.length;

        System.out.println("\nAverage: $" + average+"\n");
    }
}
