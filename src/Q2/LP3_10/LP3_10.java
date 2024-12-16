package Q2.LP3_10;
import java.util.Scanner;

public class LP3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of burgers:");
        int burger = input.nextInt();
        System.out.print("Enter number of fries:");
        int fries = input.nextInt();
        System.out.print("Enter number of sodas:");
        int soda = input.nextInt();
        ClLP3_10 wow = new ClLP3_10(burger, fries, soda);
        wow.calc();
        System.out.printf("Before tax: %.2f\n", wow.getTotal());
        System.out.printf("Tax: %.2f\n", wow.getTax());
        System.out.printf("Final price: %.2f\n", wow.getTaxTotal());
        System.out.print("Enter amount given: ");
        double given = input.nextDouble();
        //ClLP3_10 wow = new ClLP3_10(given);
        wow.setGiven(given);
        wow.calc();
        System.out.printf("Change: %.2f", wow.getChange());
    }
}
/*
Enter number of burgers:2
Enter number of fries:5
Enter number of sodas:5
Before tax: 13.78
Tax: 0.90
Final price: 14.68
Enter amount given: 20
Change: 5.32
 */
