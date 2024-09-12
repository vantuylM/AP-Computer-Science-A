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

        double Interest = a* Math.pow(1+((0.01*r)/n),((n*t)/365.0));
        double interest = Math.round(Interest)*100.00/100.00;
        double INTEREST = Interest - a;
        System.out.printf("The interest will be $%.2f\n", INTEREST);
        System.out.printf("The final price will be $%.2f\n", Interest);
    }
}
/*
Enter amount saved: 5000

Enter the interest rate: 11.5

Enter number of times compounded per year: 365

Enter number of day at interest: 900

The interest will be $1638.96
The final price will be $6638.96
 */