package alex;

public class Order {
    int orderID;
    int quantity;
    String product;
    String customer;
    String status;
    float price;
    float total;

    public int getID() {
        return orderID;
    }

    public void setID(int id) {
        if (id < 100 || id > 999) {
            throw new IllegalArgumentException("The ID must be a 3 digit number");
        }
        this.orderID = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    /**
     * Check if the product is in stock
     */
    public void checkStock() {
        // code here
    }
    
    /**
     * Add a product to the order
     */
    public void addProduct() {
        // code here
        
    }
    
    /**
     * Remove a product from the order
     */
    public void removeProduct() {
        // code here
        
    }
    
    /**
     * Finalize the order
     */
    public void finalizeOrder() {
        // code here
        
    }
}


