package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465b.dat"));
            int[][] mat = new int[3][4];

            for (int r = 0; r < mat.length; r++)
                for (int c = 0; c < mat[r].length; c++)
                    mat[r][c] = file.nextInt();

            System.out.println("Original Table:");

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++)
                    System.out.print(mat[r][c] + " ");
                System.out.println();
            }

            System.out.println();

            System.out.println("Row\tColumn");
            //for (int r = 0; r < mat.length; r++) {
             //   for (int c = 0; c < mat[r].length; c++)

           // }


        } catch (IOException e) {
            System.out.println("Error: " + e.getStackTrace());
        }
    }
}
