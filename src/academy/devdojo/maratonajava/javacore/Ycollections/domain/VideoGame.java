package academy.devdojo.maratonajava.javacore.Ycollections.domain;

public class VideoGame {
    private String brand;
    private String model;
    private String color;
    private String ItemWeight;
    private String ProductDimensions;

    // Método construtor
    public VideoGame(String brand, String model, String color, String itemWeight, String productDimensions) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.ItemWeight = itemWeight;
        this.ProductDimensions = productDimensions;
    }

    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true se x for diferente  de null
    // Para x diferente de null, x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return  true;
        if (this.getClass() != obj.getClass()) return false;
        VideoGame videoGame = (VideoGame) obj;
        return brand != null && brand.equals(videoGame.brand);
    }

    // se x.equals(y) == true, y.hashCode() == x.hashCode()
    // y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true
    // x.equals(y) == false
    // y.hashCode() != x.hashCode() x.equals(y) deverá ser false.
    @Override
    public int hashCode() {
        return brand == null ? 0 : this.brand.hashCode();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getItemWeight() {
        return ItemWeight;
    }

    public void setItemWeight(String itemWeight) {
        this.ItemWeight = itemWeight;
    }

    public String getProductDimensions() {
        return ProductDimensions;
    }

    public void setProductDimensions(String productDimensions) {
        this.ProductDimensions = productDimensions;
    }
}
