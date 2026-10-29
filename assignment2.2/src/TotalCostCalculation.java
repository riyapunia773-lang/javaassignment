
import java.util.ArrayList;

public class TotalCostCalculation {

    ArrayList<String> items = new ArrayList<>();
    ArrayList<Double> costs = new ArrayList<>();

    void addItem(String item, double cost) {
        items.add(item);
        costs.add(cost);
    }

    double calculateTotalCost() {
        double total = 0;

        for (int i = 0; i < costs.size(); i++) {
            total = total + costs.get(i);
        }

        return total;
    }

    void displayList() {
        System.out.println("Grocery List:");

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + " - " + costs.get(i));
        }
    }

    public static void main(String[] args) {

        TotalCostCalculation g = new TotalCostCalculation();

        g.addItem("Apples", 50.0);
        g.addItem("Milk", 30.0);
        g.addItem("Bread", 40.0);

        g.displayList();

        System.out.println("Total Cost: " + g.calculateTotalCost());
    }
}
