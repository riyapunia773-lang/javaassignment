
import java.util.ArrayList;

public class QuantityTracking {

    ArrayList<String> items = new ArrayList<>();
    ArrayList<Double> costs = new ArrayList<>();
    ArrayList<String> categories = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();

    // Add item with cost, category and quantity
    void addItem(String item, double cost, String category, int quantity) {
        items.add(item);
        costs.add(cost);
        categories.add(category);
        quantities.add(quantity);
    }

    // Update quantity
    void updateQuantity(String item, int newQuantity) {
        int index = items.indexOf(item);

        if (index != -1) {
            quantities.set(index, newQuantity);
            System.out.println("Quantity updated successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Display items with positive quantity
    void displayAvailableItems() {
        System.out.println("\nAvailable Items:");

        for (int i = 0; i < items.size(); i++) {
            if (quantities.get(i) > 0) {
                System.out.println(items.get(i)
                        + " - Quantity: " + quantities.get(i));
            }
        }
    }

    public static void main(String[] args) {

        QuantityTracking g = new QuantityTracking();

        g.addItem("Apples", 50.0, "Fruits", 5);
        g.addItem("Milk", 30.0, "Dairy", 2);
        g.addItem("Bread", 40.0, "Bakery", 0);

        g.displayAvailableItems();

        g.updateQuantity("Milk", 4);

        g.displayAvailableItems();
    }
}
