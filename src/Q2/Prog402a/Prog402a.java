package Q2.Prog402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {;
    try {
        Scanner file = new Scanner(new File("Langdat/p402a.dat"));
        //double total = 0;
        Cl402a[] num = new Cl402a[50];
        for (int lcv = 0; lcv < 42; lcv++){
            int id = file.nextInt();
            int score = file.nextInt();
            num[lcv] = new Cl402a(id, score);
        }


    } catch (IOException e) {
        System.out.println("Error: " + e.getStackTrace());
    }
}
}

