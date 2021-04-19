package academy.devdojo.maratonajava.javacore.Hinheritance.domain;

public class Person {
    protected String name;
    protected String id;
    protected Address address;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String id) {
        this(name);
        this.id = id;
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
