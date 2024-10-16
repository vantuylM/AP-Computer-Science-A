package Q1.Prog93aCl;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class Prog93aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kwh = input.nextInt();

        new File("Langdat/Prog93a.dat");
        Cl93a wow = new Cl93a(kwh);
        wow.calc();
        System.out.print(wow.toString());
    }
}
