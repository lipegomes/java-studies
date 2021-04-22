package academy.devdojo.maratonajava.javacore.Kenums.domain;

public class Customer02 {
    public enum PaymentType {
        CREDIT, DEBIT
    }

    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public Customer02(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer02{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType +
                ", paymentType=" + paymentType +
                '}';
    }
}
