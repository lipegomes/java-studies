package academy.devdojo.maratonajava.javacore.Kenums.test;

import academy.devdojo.maratonajava.javacore.Kenums.domain.Customer02;
import academy.devdojo.maratonajava.javacore.Kenums.domain.CustomerType;

public class CustomerTest02 {
    public static void main(String[] args) {
        Customer02 customer1 = new Customer02("ABB", CustomerType.CORPORATIVE, Customer02.PaymentType.DEBIT);
        Customer02 customer2 = new Customer02("Floriculture Solaris", CustomerType.CORPORATIVE, Customer02.PaymentType.CREDIT);
        Customer02 customer3 = new Customer02("Anna", CustomerType.INDIVIDUAL, Customer02.PaymentType.CREDIT);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
    }
}
