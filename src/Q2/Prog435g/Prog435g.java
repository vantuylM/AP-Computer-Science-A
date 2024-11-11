package Q2.Prog435g;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435g {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog435g.dat"));
            int[] Scores = new int[100];
            int Count = 0;

            while (file.hasNext()) {
                int Score = file.nextInt();
                Scores[Count] = Score;
                Count++;
                // Scores[Count++] = file.nextInt();
            }

            // sort the Scores (bubble sort)
            for (int j = 0; j < Count; j++) {
                for (int k = 0; k < Count-1; k++) {
                    if (Scores[k] > Scores[k+1]) {
                        int temp = Scores[k];
                        Scores[k] = Scores[k+1];
                        Scores[k+1] = temp;
                    }
                }
            }

            Cl435g[] golfers = new Cl435g[Count];
            for (int lcv = 0; lcv < Count; lcv++) {
                Cl435g cooldude = new Cl435g(Scores[lcv]);
                golfers[lcv] = cooldude;
            }

            int rank = 1;
            for (int lcv = 0; lcv < Count; lcv++) {
                golfers[lcv].setRank(rank);
                if (lcv < Count-1 && Scores[lcv] != Scores[lcv+1])
                    rank++;
            }

            System.out.println("Score\tRank");
            for (int lcv = 0; lcv < Count; lcv++)
                System.out.println(golfers[lcv].toString());

        } catch (IOException e) {
            System.out.println("Error: " + e.getStackTrace());
        }
    }
}

