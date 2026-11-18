
public class Calculator {

    int total = 0;


    public void reset() {
        total = 0;
    }


    public void add(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        total = total + number;
    }


    public int getValue() {
        return total;
    }
}

