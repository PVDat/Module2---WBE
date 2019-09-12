package Bai1;

public class Product {
    private int id;
    private String name;
    private float price;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "ID: " + id + "; Ten san pham:" + name + "; Gia: " + price + "; Mo ta: " + description;

    }

    public Product(int id, String name,

                   String description, float price) {

        this.id = id;

        this.name = name;

        this.description = description;

        this.price = price;


    }

}


