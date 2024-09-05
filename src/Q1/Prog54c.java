package Q1;
import java.util.*;

public class Prog54c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter radius: ");
        double radius = input.nextDouble();

        double pi = 3.141;

        double circumference = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("The Circumference of the circle is: " + circumference);
        System.out.print("The area of the circle is: " + area);
    }
}
/*
Please enter radius: 3.712
The Circumference of the circle is: 23.318784
The area of the circle is: 43.279663104
 */