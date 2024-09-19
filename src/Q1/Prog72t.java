package Q1;
import java.util.*;

public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first time: ");
        int a = input.nextInt();
        System.out.print("Enter the second time: ");
        int b = input.nextInt();

        double c = b - 1200;
        c = c/100.00;
        double d = a - c;
        System.out.print(d);
    }
}
