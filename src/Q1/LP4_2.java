package Q1;
import java.util.*;

public class LP4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in kilograms: ");
        int kilograms = input.nextInt();
        System.out.println("Enter length in centimeters: ");
        int length = input.nextInt();
        System.out.println("Enter width in centimeters: ");
        int width = input.nextInt();
        System.out.println("Enter the height in centimeters: ");
        int height = input.nextInt();
        int centimeters = length * width * height;
        if (kilograms < 27) {
            System.out.println("Package weight is ok");
        }else System.out.println("Package is too heavy");
        if (centimeters < 100000) {
            System.out.println("Package size is ok");
        }else System.out.println("Package is to Large");
    }
}
/*
Enter weight in kilograms:
32
Enter length in centimeters:
10
Enter width in centimeters:
25
Enter the height in centimeters:
38
Package is too heavy
Package size is ok
 */
