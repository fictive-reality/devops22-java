package exercise;

public class Wine implements Orderable {
    private float price;
    private int stock;
    private String info;
    private float alcVol;
    private String coutryOfOrigin;

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

    public void setAlcVol(float alcVol) {
        this.alcVol = alcVol;
    }

    public float getAlcVol() {
        return this.alcVol;
    }

    public void setCoutryOfOrigin(String coutryOfOrigin) {
        this.coutryOfOrigin = coutryOfOrigin;
    }

    public String getCoutryOfOrigin() {
        return this.coutryOfOrigin;
    }
}