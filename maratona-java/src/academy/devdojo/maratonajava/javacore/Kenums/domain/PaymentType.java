package academy.devdojo.maratonajava.javacore.Kenums.domain;

public enum PaymentType {
    CREDIT {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.05;
        }
    },
    DEBIT {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.1;
        }
    },
    PIX {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.12;
        }
    };

    public abstract double calculateDiscount(double value);
}
