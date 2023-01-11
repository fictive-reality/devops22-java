interface Products {

    void addToCart(int increment);

    void removeFromCart(int increment);

    void setPrice(Float newPrice);

    void setName(String newName);

    void setBrand(String newBrand);

    void setSize(String newSize);

    void setProductType();

    void inStock();
}
