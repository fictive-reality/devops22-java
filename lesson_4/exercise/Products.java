package exercise;

public interface Products {

    void addToCart(int Increment);

    void removeFromCart(int Decrement);

    void setPrice(float newValue);

    void setName(String NewValue);

    void setBrand(String NewValue);

    void setSize(String NewValue);

    void setProductName(String NewValue);

    void inStock(Boolean newValue);

    void setProductType(String NewValue);

}
