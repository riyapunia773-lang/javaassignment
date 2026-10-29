
import java.util.ArrayList;

public class GroceryListManager {

    ArrayList<String> items = new ArrayList<>();
    ArrayList<Double> costs = new ArrayList<>();
    ArrayList<String> categories = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();

    // Task 1: Add an item
    void addItem(String item) {
        items.add(item);
        costs.add(0.0);
        categories.add("Other");
        quantities.add(1);
    }

    // Task 2, 3 and 4: Add item with cost, category and quantity
    void addItem(String item, double cost, String category, int quantity) {
        items.add(item);
        costs.add(cost);
        categories.add(category);
        quantities.add(quantity);
    }

    // Remove an item
    void removeItem(String item) {
        int index = items.indexOf(item);

        if (index != -1) {
            items.remove(index);
            costs.remove(index);
            categories.remove(index);
            quantities.remove(index);
            System.out.println(item + " removed.");
        } else {
            System.out.println(item + " not found.");
        }
    }

    // Display all items
    void displayList() {
        System.out.println("\nGrocery List:");

        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

    // Check whether an item exists
    boolean checkItem(String item) {
        return items.contains(item);
    }

    // Calculate total cost using quantity
    double calculateTotalCost() {
        double total = 0;

        for (int i = 0; i < items.size(); i++) {
            total = total + costs.get(i) * quantities.get(i);
        }

        return total;
    }

    // Display items by category
    void displayByCategory(String category) {
        System.out.println("\nCategory: " + category);

        for (int i = 0; i < items.size(); i++) {
            if (categories.get(i).equalsIgnoreCase(category)) {
                System.out.println(items.get(i));
            }
        }
    }

    // Update item quantity
    void updateQuantity(String item, int newQuantity) {
        int index = items.indexOf(item);

        if (index != -1) {
            quantities.set(index, newQuantity);
            System.out.println("Quantity updated.");
        } else {
            System.out.println(item + " not found.");
        }
    }

    // Display items with positive quantities
    void displayAvailableItems() {
        System.out.println("\nAvailable Items:");

        for (int i = 0; i < items.size(); i++) {
            if (quantities.get(i) > 0) {
                System.out.println(items.get(i) +
                        " - Quantity: " + quantities.get(i));
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        GroceryListManager g = new GroceryListManager();

        // Add items
        g.addItem("Apples", 2.5, "Fruits", 4);
        g.addItem("Milk", 3.0, "Dairy", 2);
        g.addItem("Bread", 2.0, "Bakery", 1);

        // Task 1: Display and check
        g.displayList();

        System.out.println("\nIs Milk present? " +
                g.checkItem("Milk"));

        // Task 2: Calculate total cost
        System.out.println("\nTotal Cost: " +
                g.calculateTotalCost());

        // Task 3: Display category
        g.displayByCategory("Fruits");

        // Task 4: Update quantity
        g.updateQuantity("Milk", 5);
        g.displayAvailableItems();

        // Remove an item
        g.removeItem("Milk");

        // Display updated list
        g.displayList();

        // Display updated total
        System.out.println("\nUpdated Total Cost: " +
                g.calculateTotalCost());
    }
}
