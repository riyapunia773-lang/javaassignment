import java.util.Scanner;
public class ques3 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Weight (g): ");
        double weight = input.nextDouble();

        double totalLuoti = weight / 13.28;

        int leiviska = (int) (totalLuoti / 640);
        totalLuoti = totalLuoti % 640;

        int naula = (int) (totalLuoti / 32);
        double luoti = totalLuoti % 32;

        System.out.printf(
                "%.0f grams is %d leiviska, %d naula, and %.2f luoti.%n",
                weight, leiviska, naula, luoti
        );
    }


}
