import lesson_4.Gruppuppgift.*;


public class Webshop_main {

    public static void main(String[] args) {

        Preorder_test_extends.preOrder();

        Preorder_test.preOrder();

        Customer.recieveOrder();

        CustomerBasket.makeOrder();
        CustomerBasket.pay();

        Inventory.produktAntal();

        Orders.customerInfo();
        Orders.decreaseInventory();
        Orders.sendOrder();

    }
}
