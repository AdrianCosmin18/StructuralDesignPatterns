package org.example.flyweight;

// order e doar parte din aplicatie, nu face ceva special decat sa consume iteme
public class Order {
    private final int orderNumber;
    private final Item item;

    Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder() {
        System.out.println("Ordering " + item + " for order number " + orderNumber);
    }
}
