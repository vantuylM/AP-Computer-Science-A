package Q1;
import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount saved: ");
        double a = input.nextDouble();
        System.out.println();

        System.out.print("Enter the interest rate: ");
        double r = input.nextDouble();
        System.out.println();

        System.out.print("Enter number of times compounded per year: ");
        int n = input.nextInt();
        System.out.println();

        System.out.print("Enter number of day at interest: ");
        int t = input.nextInt();
        System.out.println();

        double Interest = a*(1+(0.01*r/n)*(n*t/365.0));
        System.out.print(Interest);
    }
}
