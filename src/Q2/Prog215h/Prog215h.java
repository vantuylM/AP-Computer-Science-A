package Q2.Prog215h;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog215h.dat"));
            int a = 0;
            ArrayList<ClProg215h> list = new ArrayList<>();
            while (file.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getStackTrace());
        }
    }
}
