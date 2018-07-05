package jschool.shvetsovd.customer;

import jschool.shvetsovd.customer.entity.Item;
import jschool.shvetsovd.customer.entity.Order;

/**
 * Created by Dim on 05.07.2018.
 */
public class CustomerImmitation {
    public static void main(String[] args) {
        Order order;

        order = new Order();
        order.printItems();

        order = new Order(
                new Item("Coffee"),
                new Item("Burger"),
                null,
                new Item("FrenchFries")
        );

        order.addItem(new Item("Cola"));
        order.addItem(null);
        order.addItem(new Item("Chicken"));
        order.printItems();
    }
}
