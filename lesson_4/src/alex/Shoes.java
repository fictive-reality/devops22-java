package alex;

public class Shoes implements InterfaceProducts {
    private float price;
    private int stock;
    private String info;
    private float size;
    private String color;

    public Shoes (int i, int stock, String info, float size, String color) {
        this.price = i;
        this.stock = stock;
        this.info = info;
        this.size = size;
        this.color = color;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public float getSize() {
        return size;
    }

    @Override
    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Shoes{" +
                "price=" + price +
                ", stock=" + stock +
                ", info='" + info + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

}
