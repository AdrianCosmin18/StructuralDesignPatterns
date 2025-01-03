package org.example.flyweight;

// item este implementarea noastra pentru flyweight => din el vom crea
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
