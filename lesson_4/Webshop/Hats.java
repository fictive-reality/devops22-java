public class Hats implements Products {
    String name, brand, size, color;
    Float price;

    public Hats(String name, String brand, String size, String color, Float price) {
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public void addToCart() {
        System.out.println("Added to cart");
    }

    @Override
    public void removeFromCart() {
        System.out.println("Remove from cart");
    }

    @Override
    public void setPrice(Float newPrice) {
        this.price = newPrice;
    }

    @Override
    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    @Override
    public void setSize(String newSize) {
        this.size = newSize;
    }

    @Override
    public void setProductType() {
        // String productType = "Keps";
    }

    @Override
    public void inStock() {
        // Boolean buy = true;
    }

}
