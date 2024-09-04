package Q1;
import java.util.*;

public class Prog54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three digit number: ");
        int num1 = input.nextInt();
        System.out.println();

        System.out.print("Enter a three digit number: ");
        int num2 = input.nextInt();
        System.out.println();

        System.out.print("Enter a three digit number: ");
        int num3 = input.nextInt();
        System.out.println();

        System.out.print("Enter a three digit number: ");
        int num4 = input.nextInt();
        System.out.println();

        int sum = num1 + num2 + num3 + num4;
        System.out.print("The sum is " + sum);
        System.out.println();

        double avg = (double)sum / 4;
        System.out.print("The average of the 4 numbers is " + avg);

    }
}
/*
Enter a three digit number: 475

Enter a three digit number: 821

Enter a three digit number: 369

Enter a three digit number: 562

The sum is 2227
The average of the 4 numbers is 556.75
 */
