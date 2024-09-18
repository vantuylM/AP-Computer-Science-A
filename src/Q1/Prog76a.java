package Q1;
import java.util.*;

public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number you dislike ");
        int number = input.nextInt();
        int a = number * 9;
        int b = a * 12345679;
        System.out.print("Surprise " + b);
    }
}
