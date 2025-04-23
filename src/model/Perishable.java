package model;

public class Perishable {
    private String name;
    private boolean expired;

  //constructor
public Perishable (String name, boolean expired) {
    this.name = name;
    this.expired = expired;
}
//product name
public String getName() {
    return name;
}
// control for expire date
public boolean isExpired() {
    return expired;
}
//printout
public void printInfo() {
    System.out.println("Item:" + name + " | Expired:" + expired);
}

    @Override
    public String toString() {
        return "Perishable: " + name + " | Expired: " + expired;
    }
}
