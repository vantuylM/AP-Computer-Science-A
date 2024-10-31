package Q1;
import java.util.*;

public class LP4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of copies: ");
        int num = input.nextInt();
        double price  = 0;

        if (num <=99){
            price = 0.30;
        }else if (num >99 && num <=499){
            price = 0.28;
        }else if (num>499 && num<=749){
            price = 0.27;
        }else if (num>749 && num<=100){
            price = 0.26;
        }else {
            price = 0.25;
        }
        double cost = price * num;
        System.out.println("Price per copy is :" + price);
        System.out.print("The cost is : "+cost);
    }
}
/*
Enter number of copies:
1001
Price per copy is :0.25
The cost is : 250.25
 */