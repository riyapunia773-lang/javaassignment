import java.util.Scanner;
public class task1 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a,b,c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b*b-4*a*c;

        if(d<0) {
            System.out.println("No real roots");
        } else {
            double  x1 = (-b + Math.sqrt(d))/(2*a);
            double  x2 = (-b - Math.sqrt(d))/(2*a);

            System.out.println("Root 1:"+ x1);
            System.out.println("Root 2:"+ x2);


        }

    }
}
