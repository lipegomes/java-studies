package academy.devdojo.maratonajava.introduction;

public class ConvertGalToLiters {
    public static void main(String[] args) {
        double usGallons, liters;
        int counter;

        // Contador de linhas inícia em zero
        counter = 0;
        for (usGallons = 1; usGallons <= 100; usGallons++) {
            //  Converte para litros
            liters = usGallons * 3.7854;
            System.out.println(usGallons + " gal = " + liters + "L");

            // Incrementa o contador a cada interação no loop
            counter++;
            //
            if (counter == 10) {
                System.out.println();
                // Reseta o contador de linhas
                counter = 0;
            }
        }
    }
}
