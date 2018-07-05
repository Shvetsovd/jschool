package jschool.shvetsovd.customer.entity;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dim on 05.07.2018.
 */
public class Order {
    private final List<Item> items;

    public Order() {
        items = new ArrayList<>();
    }

    public Order(Item... items) {
        this();
        for (Item item : items) {
            addItem(item);
        }
    }

    public void addItem(@Nullable Item item) {
        if (item != null) {
            items.add(item);
        }
    }

    public void printItems() {
        System.out.print("[");

        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i).getName());

            if (i != items.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    /* no overriding toString(), equals() and etc */
}
