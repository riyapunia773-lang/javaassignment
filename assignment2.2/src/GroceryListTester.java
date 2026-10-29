
import java.util.ArrayList;

public class GroceryListTester {

    ArrayList<String> items = new ArrayList<>();
    ArrayList<Double> costs = new ArrayList<>();
    ArrayList<String> categories = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();

    // Add grocery item
    void addItem(String item, double cost, String category, int quantity) {
        items.add(item);
        costs.add(cost);
        categories.add(category);
        quantities.add(quantity);
    }

    // Calculate total cost
    double calculateTotalCost() {
        double total = 0;

        for (int i = 0; i < items.size(); i++) {
            total = total + costs.get(i) * quantities.get(i);
        }

        return total;
    }

    // Display items by category
    void displayByCategory(String category) {
        System.out.println("\nItems in " + category + ":");

        for (int i = 0; i < items.size(); i++) {
            if (categories.get(i).equalsIgnoreCase(category)) {
                System.out.println(items.get(i));
            }
        }
    }

    // Update quantity
    void updateQuantity(String item, int quantity) {
        int index = items.indexOf(item);

        if (index != -1) {
            quantities.set(index, quantity);
            System.out.println("Quantity updated.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Display all items
    void displayList() {
        System.out.println("\nGrocery List:");

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i)
                    + " | Cost: " + costs.get(i)
                    + " | Category: " + categories.get(i)
                    + " | Quantity: " + quantities.get(i));
        }
    }

    public static void main(String[] args) {

        GroceryListTester g = new GroceryListTester();

        // Add items
        g.addItem("Apples", 50.0, "Fruits", 4);
        g.addItem("Milk", 30.0, "Dairy", 2);
        g.addItem("Bread", 40.0, "Bakery", 1);

        // Display grocery list
        g.displayList();

        // Test total cost
        System.out.println("\nTotal Cost: " + g.calculateTotalCost());

        // Test categories
        g.displayByCategory("Fruits");

        // Test quantity update
        g.updateQuantity("Milk", 5);

        // Display updated list
        g.displayList();

        // Display updated total cost
        System.out.println("\nUpdated Total Cost: "
                + g.calculateTotalCost());
    }
}
