package Q1;
import java.util.*;

public class LP4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random a = new Random();
        int num1 = a.nextInt(20);
        System.out.println("Enter number between 1-20:");
        int num2 = input.nextInt();
        System.out.println("Computer number is: "+num1);
        System.out.println("Player number is: "+num2);
        if (num1 == num2){
            System.out.print("Correct!");
        }else {
            System.out.print("Better luck next time!");
        }
    }
}

/*
Enter number between 1-20:
14
Computer number is: 18
Player number is: 14
Better luck next time!
 */
