package academy.devdojo.maratonajava.javacore.Kenums.test;

import academy.devdojo.maratonajava.javacore.Kenums.domain.Customer;
import academy.devdojo.maratonajava.javacore.Kenums.domain.CustomerType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Kelly", CustomerType.INDIVIDUAL);
        Customer customer2 = new Customer("Foobar Motors", CustomerType.CORPORATIVE);

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
