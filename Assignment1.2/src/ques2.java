import java.util.Scanner;
public class ques2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first leg: ");
        double a = input.nextDouble();

        System.out.print("Enter the second leg: ");
        double b = input.nextDouble();

        double c = Math.sqrt(a * a + b * b);

        System.out.println("The hypotenuse is: " + c);
    }
}
