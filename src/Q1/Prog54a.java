package Q1;
import java.util.*;

public class Prog54a {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        // int, double, boolean, String
        System.out.print("Enter the car model: ");
        String model = Keyboard.nextLine();

        System.out.print("Enter miles driven: ");
        int miles = Keyboard.nextInt();
        // double miles = Keyboard.nextDouble();

        System.out.print("Enter gallons used: ");
        int gallons = Keyboard.nextInt();

        double mpg = miles / (double)gallons;
        System.out.println("MPG used by " + model + " is " + mpg + "m/g");
    }
}


/*
Enter the car model: 1979 VW Bug
Enter miles driven: 286
Enter gallons used: 9
MPG used by 1979 VW Bug is 31.77777777777778m/g
*/
