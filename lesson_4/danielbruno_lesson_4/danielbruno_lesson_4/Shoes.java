package danielbruno_lesson_4;

public class Shoes implements Products {
    private float price;
    private int stock;
    private String info;
    private float size;
    private String type;

    public float getSize() {
        return this.size;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public int getStock() {
        return this.stock;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    public static void main(String[] args) {
        Shoes shoes = new Shoes();
        System.out.println(shoes.info);

    }
}
