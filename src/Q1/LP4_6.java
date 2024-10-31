package Q1;
import java.util.*;

public class LP4_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random a = new Random();
        Random b = new Random();
        Random c = new Random();
        int num3 = c.nextInt(10);
        int num2 = b.nextInt(10);
        int num1 = a.nextInt(10);
        String x = "";
        double answer = 0;
        String y = "";

        if (num3<=3){
            x += "*";
            answer = num1 * num2;
            y = num1 + x + num2;
        }
        else if (num3>3 && num3<=6){
            x += "+";
            answer = num1 + num2;
            y = num1 + x + num2;
        }
        else if (num3>6 && num3<=8){
            x += "-";
            answer = num1 - num2;
            y = num1 + x + num2;
        }
        else if (num3>8 && num3<=10){
            x += "/";
            answer = num1 / num2;
            y = num1 + x + num2;
        }
        System.out.println(y + ":");
        double in = input.nextDouble();
        if (answer == in){
            System.out.print("Correct!");
        }else {
            System.out.print("Incorrect!");
        }
    }
    }

    /*
    8+3:
55
Incorrect!

1-8:
-7
Correct!
     */
