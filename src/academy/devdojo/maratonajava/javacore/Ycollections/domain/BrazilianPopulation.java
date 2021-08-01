package academy.devdojo.maratonajava.javacore.Ycollections.domain;

import java.util.Objects;

public class BrazilianPopulation implements Comparable<BrazilianPopulation> {
    private Long age;
    private int year;
    private Long population;
    private char gender;

    public BrazilianPopulation(Long age, int year, Long population, char gender) {
        Objects.requireNonNull(age, "Id não pode ser nulo");
        this.age = age;
        this.year = year;
        this.population = population;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrazilianPopulation that = (BrazilianPopulation) o;
        return year == that.year && gender == that.gender && age.equals(that.age) && population.equals(that.population);
    }

    @Override
    public String toString() {
        return "BrazilianPopulation{" +
                "age=" + age +
                ", year=" + year +
                ", population=" + population +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, year, population, gender);
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(BrazilianPopulation age) {
        // retorna negativo se o this < age
        if (this.age < age.getAge()) {
            return -1;
        }
        // retorna 0 se this é == age
        else if (this.age.equals(age.getAge())) {
            return 0;
        }
        // retorna positivo se this > age
        else {
            return +1;
        }
    }
}
