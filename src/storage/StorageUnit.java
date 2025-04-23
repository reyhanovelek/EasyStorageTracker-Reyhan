package storage;

import javax.swing.*;

public class StorageUnit<T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void printItemInfo() {
        if (item != null) {
            System.out.println("Stored item : " + item.toString());
        } else {
            System.out.println("Not stored item. ");
        }
    }
}


