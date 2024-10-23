package Q1;
import java.util.*;

public class LP4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of eggs: ");
        int eggs = input.nextInt();
        int dozen = eggs / 12;
        int remain = eggs % 12;
        double price = 0.00;
        double perEgg = 0;
        double extraEgg = 0;

        if (dozen < 4) {
            price = 0.50;
            perEgg = price / 12;
            extraEgg = perEgg * remain;
        }else if (dozen >=4 && dozen < 6) {
            price = 0.45;
            perEgg = price / 12;
            extraEgg = perEgg * remain;
        }else if (dozen >=6 && dozen < 11){
            price = 0.40;
            perEgg = price / 12;
            extraEgg = perEgg * remain;
        }else if (dozen >=11){
            price = 0.35;
            perEgg = price / 12;
            extraEgg = perEgg * remain;
        }
        System.out.print("The bill is: "+ bill);
    }
}
