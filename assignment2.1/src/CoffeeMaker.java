
public class CoffeeMaker {
    private boolean isOn;
    private String coffeeType;
    private int coffeeAmount;

    public CoffeeMaker() {
        isOn = false;
        coffeeType = "normal";
        coffeeAmount = 10;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setCoffeeType(String newCoffeeType) {
        if (isOn && (newCoffeeType.equals("normal")
                || newCoffeeType.equals("espresso"))) {
            coffeeType = newCoffeeType;
        }
    }

    public void setCoffeeAmount(int newCoffeeAmount) {
        if (isOn && newCoffeeAmount >= 10
                && newCoffeeAmount <= 80) {
            coffeeAmount = newCoffeeAmount;
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}
