package gomes.filipe.mathematics.domain;

public class RadianToDegree {

    public void calculateRadianToDegree(double radiance) {
        double PI_RADIANS = 180.0;
        double ONE_RADIANS = PI_RADIANS / Math.PI;
        double degrees = radiance * ONE_RADIANS;

        System.out.println("Radiance " + radiance + " in degrees: " + degrees);
    }
}
