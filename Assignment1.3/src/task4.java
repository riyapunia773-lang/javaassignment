
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score;

        do {
            score = 0;

            for (int i = 1; i <= 10; i++) {
                int a = (int)(Math.random() * 10) + 1;
                int b = (int)(Math.random() * 10) + 1;

                System.out.print(a + " x " + b + " = ");
                int answer = sc.nextInt();

                if (answer == a * b) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong!");
                }
            }

            System.out.println("Score: " + score + "/10");

        } while (score < 10);

        System.out.println("Congratulations! You mastered the tables!");

        sc.close();
    }
}
