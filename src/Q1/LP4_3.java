package Q1;
import java.util.*;

public class LP4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of eggs: ");
        int eggs = input.nextInt();
        int dozen = 0;
        double price = 0;
        double a = 0;
        while (eggs >= 12) {
            eggs -= 12;
            dozen += 1;
        }
        if (dozen < 4) {
            price = 0.50;
            a = (eggs) * (price * 0.0833;
        }
        if (dozen < 6 && dozen >= 4) {
            price = 0.45;
            a = (eggs) * (price * 0.833);
        }
    }
}
