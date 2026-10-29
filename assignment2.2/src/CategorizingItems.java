
import java.util.ArrayList;

public class CategorizingItems {

    ArrayList<String> items = new ArrayList<>();
    ArrayList<Double> costs = new ArrayList<>();
    ArrayList<String> categories = new ArrayList<>();

    // Add item with cost and category
    void addItem(String item, double cost, String category) {
        items.add(item);
        costs.add(cost);
        categories.add(category);
    }

    // Display items by category
    void displayByCategory(String category) {
        System.out.println("\nCategory: " + category);

        for (int i = 0; i < items.size(); i++) {
            if (categories.get(i).equalsIgnoreCase(category)) {
                System.out.println(items.get(i) + " - " + costs.get(i));
            }
        }
    }

    // Display all items
    void displayList() {
        System.out.println("Grocery List:");

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + " - "
                    + costs.get(i) + " - " + categories.get(i));
        }
    }

    public static void main(String[] args) {

        CategorizingItems g = new CategorizingItems();

        g.addItem("Apples", 50.0, "Fruits");
        g.addItem("Milk", 30.0, "Dairy");
        g.addItem("Bread", 40.0, "Bakery");
        g.addItem("Bananas", 20.0, "Fruits");

        g.displayList();

        g.displayByCategory("Fruits");
    }
}
