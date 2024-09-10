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
        double Tax = price / 3;
        double tax = price + Tax;
        double fprice = price + Surcharge + Tax;
        double Late = fprice / 4;
        double late = Late + fprice;

        System.out.print("COMPSCI Electric\n------------------------\nKilowatts Used" + kwh + "\n--------------------------------\nBase Rate " + kwh + "@ $0.047 $ " + Math.round(price) + "\nSurcharge $ "+ Math.round(Surcharge) +"\nCity Tax $ " + Math.round(Tax) + "\n---------\nPay this amount "+ Math.round(fprice) + "\nAfter may 20th pay "+ Math.round(late));
    }
}
    //Enter KWH used 993
     //   C O M P S C I Electric
      //  ------------------------------------------------
      //  Kilowatts Used 993
      //  ------------------------------------------------
      //  Base Rate 993 @ $ 0.0475 $ 47.17
      //  Surcharge $ 4.72
      //  Citytax $ 1.42
      //  ______
       // Pay this amount $ 53.31
       // After May 20th Pay $ 55.44