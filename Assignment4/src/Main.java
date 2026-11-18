
public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(5);
        calculator.add(10);
        calculator.add(3);

        System.out.println("Total: " + calculator.getValue());

        calculator.reset();

        System.out.println("After reset: " + calculator.getValue());
    }
}
