package exercise;

public class Hats implements Products {
    String name, brand, size, color;
    float price;

    Hats(String name, String brand, String size, String color, float price) {
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public void addToCart(int Increment) {

    }

    @Override
    public void removeFromCart(int Decrement) {

    }

    @Override
    public void setName(String NewValue) {

    }

    @Override
    public void setBrand(String NewValue) {

    }

    @Override
    public void setProductName(String NewValue) {

    }

    @Override
    public void setSize(String NewValue) {

    }

    @Override
    public void setPrice(float newValue) {

    }

    @Override
    public void inStock(Boolean newValue) {

    }

    @Override
    public void setProductType(String NewValue) {

    }
}
