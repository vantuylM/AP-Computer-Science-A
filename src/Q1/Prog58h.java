package Q1;
import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount saved: ");
        int amount = input.nextInt();
        System.out.println();

        System.out.print("Enter the interest rate: ");
        double rate = input.nextDouble();
        System.out.println();

        System.out.print("Enter number of times compounded per year: ");
        int year = input.nextInt();
        System.out.println();

        System.out.print("Enter number of day at interest: ");
        int days = input.nextInt();
        System.out.println();

        double interest = amount*(1+(0.1*rate/year)*year*days/365);
        System.out.print(interest);
    }
}
