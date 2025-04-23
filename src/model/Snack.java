package model;

// snack inheritage from Perisable
public class Snack extends Perishable {
    private int calories;

    //constructor , enter the snack name,expired or not and calories
public Snack(String name ,boolean expired, int calories) {
    super(name, expired);//super class (Perishable) get that from there
    this.calories = calories;
}
public int getCalories() {
    return calories;
}
    @Override
    public void printInfo() {
        System.out.println("Snack:" + getName() + " | Expired: " + isExpired() + " | Calories:" + calories);
    }

        @Override
        public String toString() {
            return "Snack: " + getName() + " | Expired: " + isExpired() + " | Calories: " + calories;
        }

    }


