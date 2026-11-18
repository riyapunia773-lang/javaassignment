
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class TemperatureAverage {

    public static void main(String[] args) {

        String csvUrl = "https://users.metropolia.fi/~jarkkov/temploki.csv";

        double total = 0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new URL(csvUrl).openStream()))) {

            String line;

            // Skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] values = line.split(";");

                // Date is in column 0
                // UlkoTalo is in column 1

                if (values.length < 2) {
                    continue;
                }

                String date = values[0].trim();

                if (date.startsWith("01.01.2023")) {

                    String temperature = values[1].trim();

                    if (!temperature.isEmpty()) {
                        double temp = Double.parseDouble(
                                temperature.replace(",", "."));

                        total += temp;
                        count++;
                    }
                }
            }

            if (count > 0) {

                double average = total / count;

                System.out.println("Date: 01.01.2023");
                System.out.println("Measurements: " + count);
                System.out.println("Average temperature: "
                        + average + " °C");

            } else {
                System.out.println("No measurements found.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
