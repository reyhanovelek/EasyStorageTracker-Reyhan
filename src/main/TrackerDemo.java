package main;

import model.Book;
import model.Device;
import model.Snack;
import storage.StorageUnit;
import storage.StorageUtils;

import java.util.ArrayList;
import java.util.List;

public class TrackerDemo{
    public static void main(String[] args) {


        //book test
        Book book = new Book ("Sapiens", "Harari");
        StorageUnit<Book> bookBox = new StorageUnit<>();
        bookBox.addItem(book);
        bookBox.printItemInfo();

        //device test
        Device device = new Device("Vacuum Cleaner ", "Dyson");
        StorageUnit<Device> deviceBox = new StorageUnit<>();
        deviceBox.addItem(device);
        StorageUtils.displayItem(deviceBox.getItem());

        //Snack test with Perisable check
        Snack snack = new Snack("Chocolate Bar", false, 200);
        StorageUnit<Snack> snackBox = new StorageUnit<>();
        snackBox.addItem(snack);
        StorageUtils.checkPerishable(snackBox.getItem());

        //wildcard test
        List<Object> allItems = new ArrayList<>();
        allItems.add(book);
        allItems.add(device);
        allItems.add(snack);
        StorageUtils.printItems(allItems);
    }
}


