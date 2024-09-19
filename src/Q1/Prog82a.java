package Q1;
import java.util.*;

public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed limit: ");
        int a = input.nextInt();
        System.out.println("Enter the vehicle speed: ");
        int b = input.nextInt();
        int speeding = b - a;
        int pay = (speeding * 5) + 20;
        System.out.print("Fine----------" + pay);
    }
}
/*
Enter the speed limit:
30
Enter the vehicle speed:
42
Fine----------80
 */
