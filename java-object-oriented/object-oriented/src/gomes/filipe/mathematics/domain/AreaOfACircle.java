package gomes.filipe.mathematics.domain;

public class AreaOfACircle {

    public void calculateAreaOfACircle(int radius) {
        double area = Math.PI * (radius * radius);
        System.out.println("Radius: " + radius + " Area of a circle: "  + area);
    }
}
