package Q1;
import java.util.*;

public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter KWH used ");
        int kwh = input.nextInt();

        double price = kwh * 0.0475;
        double Surcharge = price / 10;
        double surcharge = price + Surcharge;
        double Tax = price * 0.03;
        double tax = price + Tax;
        double fprice = price + Surcharge + Tax;
        double Late = fprice / 4;
        double late = Late + fprice;

        System.out.print("COMPSCI Electric\n------------------------\nKilowatts Used" + kwh + "\n--------------------------------\nBase Rate " + kwh + "@ $0.047 $ " + Math.round(price * 100.00) / 100.00+ "\nSurcharge $ "+ Math.round(Surcharge * 100.00) / 100.00 +"\nCity Tax $ " + Math.round(Tax * 100.00) / 100.00 + "\n---------\nPay this amount "+ Math.round(fprice * 100.00) / 100.00 + "\nAfter may 20th pay "+ Math.round(late * 100.00) / 100.0);
    }
}
/*
Enter KWH used 993
COMPSCI Electric
------------------------
Kilowatts Used993
--------------------------------
Base Rate 993@ $0.047 $ 47.17
Surcharge $ 4.72
City Tax $ 1.42
---------
Pay this amount 53.3
After may 20th pay 66.62
 */