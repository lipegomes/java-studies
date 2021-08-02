package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Smartphone;

public class SmartphoneTest01 {
    public static void main(String[] args) {
        Smartphone epouPhone12 = new Smartphone("AC3PO4K11WC3H5", "Epou");
        Smartphone sunsuGalax21 = new Smartphone("34KBZ890ZYUR4", "Sansu");
        Smartphone epouPhone = epouPhone12;
        System.out.println("epouPhone12 = sunsuGalax21 ? " + epouPhone12.equals(sunsuGalax21));
        System.out.println("epouPhone12 = epouPhone ? " + epouPhone12.equals(epouPhone));
    }
}
