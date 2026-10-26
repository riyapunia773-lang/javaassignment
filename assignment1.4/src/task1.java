
import java.util.Scanner;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] firstNames = {
                "John", "Emma", "Michael", "Olivia",
                "James", "Sophia", "Daniel", "Emily"
        };

        String[] lastNames = {
                "Smith", "Johnson", "Brown", "Taylor",
                "Anderson", "Thomas", "Wilson", "Martin"
        };

        System.out.print("How many random names should be generated? ");
        int numberOfNames = scanner.nextInt();

        for (int i = 0; i < numberOfNames; i++) {
            int firstIndex = random.nextInt(firstNames.length);
            int lastIndex = random.nextInt(lastNames.length);

            String fullName = firstNames[firstIndex] + " " + lastNames[lastIndex];

            System.out.println(fullName);
        }

        scanner.close();
    }
}


