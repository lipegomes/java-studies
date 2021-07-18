package academy.devdojo.maratonajava.introduction;

public class GettersAndSetters {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() > 2) {
            this.name = name;
        }
    }
}
