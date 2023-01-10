import lesson_4.Gruppuppgift.*;

public class Webshop_main {

    public static void main(String[] args) {

        Customer.recieveOrder();

        
        CustomerBasket.makeOrder();
        CustomerBasket.pay();

        Inventory.produktAntal();

        Orders.customerInfo();
        Orders.decreaseInventory();
        Orders.sendOrder();

    }
}
