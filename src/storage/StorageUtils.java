package storage;

import model.Perishable;
import java.util.List;

public class StorageUtils {

    //wildcard method
    public static void printItems(List<? extends Object> items){
        for (Object item : items){
            System.out.println("Item:" + item.toString());
        }
    }
    //generic method
    public static <T> void displayItem(T item) {
        System.out.println("Displaying item : " + item.toString());
    }

//Bounded Type Method just for perishable and subclasses
    public static <T extends Perishable > void checkPerishable(T item) {
        if (item.isExpired()) {
            System.out.println("⚠️ " + item.getName() + " is expired!");
        } else {
            System.out.println("✅ " + item.getName() + " is still good to use.");
        }
    }
}
