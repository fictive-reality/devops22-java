package exercise;

public class Hat implements Orderable {
    private float price;
    private int stock;
    private String info;
    private int size;
    private String color;

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int getStock() {
        return this.stock;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}