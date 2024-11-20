package Q2.Prog402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {;
    try {
        Scanner file = new Scanner(new File("Langdat/p402a.dat"));
        double total = 0;

        while (file.hasNext()) {
            int id = file.nextInt();
            int score = file.nextInt();
            total += score;
            System.out.println(total);
            Cl402a wow = new Cl402a(id, score, total);
            wow.calc();
            System.out.println(wow);
        }

    } catch (IOException e) {
        System.out.println("Error: " + e.getStackTrace());
    }
}
}

