package Q1;
import java.util.*;
import java.lang.Math;

public class LP4_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter angle:");
        double a = input.nextInt();
        double b = Math.sin(a);
        double c = Math.cos(a);
        double d = Math.tan(a);
        double e = Math.toRadians(a);
        System.out.println("Sine: "+b);
        System.out.println("cosine:"+c);
        System.out.println("Tangent:"+d);
    }
}
