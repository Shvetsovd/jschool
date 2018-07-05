package jschool.shvetsovd.customer.entity;

/**
 * Created by Dim on 05.07.2018.
 */
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    /* no overriding toString(), equals() and etc */
}
