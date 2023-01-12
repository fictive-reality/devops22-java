package danielbruno_lesson_4;

public class Hat implements Products {
    private float price;
    private int stock;
    private String info;
    private float size;
    private String color;

    public float getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
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
        Hat hat = new Hat();
        System.out.println(hat.price);
    }
}
