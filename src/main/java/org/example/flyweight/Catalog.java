package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;


// Catalog e ca un factory si cache pentru Item
public class Catalog {
    private Map<String, Item> items = new HashMap<String, Item>();

    //factory method
    public Item lookup(String itemName) {
        if (!items.containsKey(itemName))
            items.put(itemName, new Item(itemName));
        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}
