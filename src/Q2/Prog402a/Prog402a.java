package Q2.Prog402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {public static void main(String[] args) {
    try {
        Scanner file = new Scanner(new File("Langdat/prog402a.dat"));

        while (file.hasNext()) {
            int id = file.nextInt();
            int score = file.nextInt();
        }

    } catch (IOException e) {
        System.out.println("Error: " + e.getStackTrace());
    }
}
}

