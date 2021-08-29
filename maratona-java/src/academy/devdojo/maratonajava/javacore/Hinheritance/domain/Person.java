package academy.devdojo.maratonajava.javacore.Hinheritance.domain;

public class Person {
    protected String name;
    protected String id;
    protected Address address;

    static {
        System.out.println("Inside static person block");
    }

    {
        System.out.println("Inside non-static person block 1");
    }

    {
        System.out.println("Inside non-static person block 2");
    }

    public Person(String name) {
        System.out.println("Inside person constructor");
        this.name = name;
    }

    public void prints() {
        System.out.println("Name: " + this.name);
        System.out.println("Id: " + this.id);
        System.out.println("Address: " + this.address.getStreet() + " Postal Code: " + this.address.getPostalCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
