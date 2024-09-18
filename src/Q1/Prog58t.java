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

        double dollar = 1;
        double quarter = 0.25;
        double dime = 0.10;
        double nickel = 0.05;
        double penny = 0.01;
        double givedollar = 0;
        double givequarter = 0;
        double givedime = 0;
        double givenickle = 0;
        double givepenny = 0;

        double give = given - price;
        double Give = 0;

        //int GIVE = (int)give;
        //double a = give % GIVE;
        //System.out.println("Dollar(s) " + GIVE);
        //System.out.println("Change is " + a*100.00/100.00);
        System.out.println("Change is: " + give);
        while (give > 0) {
            if (give >= 1) {
                give -= 1;
                givedollar += 1;
                //System.out.println(givedollar);
            }
            else if (give >= 0.25) {
                give -= 0.25;
                givequarter += 1;
                //System.out.println(givequarter);
            }
            else if (give >= 0.10) {
                give -= 0.10;
                givedime +=1;
                //System.out.println(givedime);
            }
            else if (give >= 0.05) {
                give -= 0.05;
                givenickle += 1;
                //System.out.println(givenickle);
            }
            else if (give >=0.01) {
                give -= 0.01;
                givepenny += 1;
                //System.out.print(givepenny);=
            }
            else {give = 0; }
        }
            //System.out.println(givedollar);
        System.out.println("Dollars" + givedollar + "\n Quarters" + givequarter + "\n Dimes" + givedime + "\n Nickle" + givenickle + "\nPenny" + givepenny);

        //if (give >= dollar) Give

    }
}
/*
Enter amount: 125.32

Enter money given 140.00

Change is: 14.68
Dollars14.0
 Quarters2.0
 Dimes1.0
 Nickle1.0
Penny3.0
 */