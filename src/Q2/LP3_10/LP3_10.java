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
        System.out.println("Before tax: " + wow.getTotal());
        System.out.println("Tax: " + wow.getTax());
        System.out.println("Final price: " + wow.getTaxTotal());
        System.out.print("Enter amount given: ");
        double given = input.nextDouble();
        //ClLP3_10 wow = new ClLP3_10(given);
        wow.setGiven(given);
        wow.calc();
        System.out.print("Change: " + wow.getChange());
    }
}
