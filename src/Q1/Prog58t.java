package Q1;
import java.util.*;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double price = input.nextDouble();
        System.out.println();

        System.out.print("Enter money given ");
        double given = input.nextDouble();
        System.out.println();

        int dollar = 1;
        double quarter = 0.25;
        double dime = 0.10;
        double nickel = 0.05;
        double penny = 0.01;

        double give = given - price;
        System.out.print(give);

    }
}
