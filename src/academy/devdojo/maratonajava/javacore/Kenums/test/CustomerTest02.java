package academy.devdojo.maratonajava.javacore.Kenums.test;

import academy.devdojo.maratonajava.javacore.Kenums.domain.Customer02;
import academy.devdojo.maratonajava.javacore.Kenums.domain.CustomerType;
import academy.devdojo.maratonajava.javacore.Kenums.domain.PaymentType;

public class CustomerTest02 {
    public static void main(String[] args) {
        Customer02 customer1 = new Customer02("ABB", CustomerType.CORPORATIVE, PaymentType.DEBIT);
        Customer02 customer2 = new Customer02("Floriculture Solaris", CustomerType.CORPORATIVE, PaymentType.CREDIT);
        Customer02 customer3 = new Customer02("Anna", CustomerType.INDIVIDUAL, PaymentType.CREDIT);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(PaymentType.DEBIT.calculateDiscount(1000));
        System.out.println(PaymentType.CREDIT.calculateDiscount(765));
        System.out.println(PaymentType.PIX.calculateDiscount(12000));
    }
}
