
import java.io.FileWriter;
import java.io.IOException;

public class FibonacciCSV {

    public static void main(String[] args) {

        String fileName = "fibonacci.csv";

        long first = 0;
        long second = 1;

        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write("Index,Fibonacci Number\n");

            for (int i = 0; i < 60; i++) {

                writer.write(i + "," + first + "\n");

                long next = first + second;

                first = second;
                second = next;
            }

            System.out.println("Fibonacci CSV file created successfully!");

            System.out.println("Total numbers: 60");

            System.out.println("Last number: " + first);

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
