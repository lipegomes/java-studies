package academy.devdojo.maratonajava.javacore.Ycollections.domain;

import java.util.Objects;

public class Fruits {
    private Long id;
    private String name;
    private String kingdom;
    private String family;
    private String genus;

    public Fruits(Long id, String name, String kingdom, String family, String genus) {
        Objects.requireNonNull(id, "Id não pode ser nulo");
        Objects.requireNonNull(name, "Name não pode ser nulo");
        this.id = id;
        this.name = name;
        this.kingdom = kingdom;
        this.family = family;
        this.genus = genus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruits fruits = (Fruits) o;
        return (id.equals(fruits.id) && name.equals(fruits.name) && Objects.equals(kingdom, fruits.kingdom) && Objects.equals(family, fruits.family) && Objects.equals(genus, fruits.genus));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, kingdom, family, genus);
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kingdom='" + kingdom + '\'' +
                ", family='" + family + '\'' +
                ", genus='" + genus + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }
}
