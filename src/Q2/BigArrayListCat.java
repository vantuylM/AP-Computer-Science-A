package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class BigArrayListCat {
    public static void printCat(Cat cat) {
        System.out.printf("%s\t%.2f\t%d\t$%.2f\n",
                cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
    }
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numCats = file.nextInt();
            file.nextLine();
            ArrayList<Cat> cats = new ArrayList<>();

            for (int lcv = 0; lcv < numCats; lcv++) {
                String n = file.nextLine();
                double w = file.nextDouble();
                int a  = file.nextInt();
                double c = file.nextDouble();
                file.nextLine();
                cats.add(new Cat(n, w, a, c));
            }

            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats)
                printCat(cat);

            System.out.println("\n2. The third cat is named: " + cats.get(2).getName());

            cats.get(cats.size()-1).setWeight(cats.get(cats.size()-1).getWeight() + 10);
            System.out.println("\n3. The updated weight is: " + cats.get(cats.size()-1).getWeight());

            for (int i = 0; i < cats.size(); i++)
                if (cats.get(i).getName().equals("Rascal"))
                    cats.remove(i);

            cats.add(1, new Cat("Angle", 3.6, 1, 25.99));

            cats.add(new Cat("Gimpy", 14.3, 10, 29.99));

            System.out.println("\n7. The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats)
                printCat(cat);

            Cat third = cats.get(2);
            cats.set(2, new Cat("Sugar", 23.6, 7, 33.25));
            cats.add(third);

            Cat temp = cats.get(1);
            cats.set(1, cats.get(3));
            cats.set(3, temp);

            System.out.println("\n10. The current cat names are: ");
            for (Cat c : cats)
                System.out.print(c.getName() + "\t");
            System.out.println();

            for (int i = 0; i < cats.size(); i++) {
                if (cats.get(i).getCost() < 26) {
                    cats.remove(i);
                    i--;
                }
            }

            System.out.println("\n11. The costs of the remaining cats are: ");
            for (Cat c : cats)
                System.out.print(c.getName() + "\t");
            System.out.println();

            System.out.println("\n12. The cats being put on a diet are: ");
            for (int lcv = 0; lcv < cats.size(); lcv++) {
                Cat c = cats.get(lcv);
                if (c.getWeight() > 15)
                    System.out.print(c.getName() + "\t");
            }
            System.out.println();

            while (file.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getStackTrace());
        }
    }
}
