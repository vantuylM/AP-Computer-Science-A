package Q2.LP3_14;
import java.util.*;

public class LP3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Election results for New York\nAwbrey: ");
        int AVNY = input.nextInt();
        System.out.print("Martinez: ");
        int MVNY = input.nextInt();
        ClLP3_14 wow = new ClLP3_14(AVNY, MVNY);
        System.out.print("Election results for New Jersey\nAwbrey: ");
        int AVNJ = input.nextInt();
        System.out.print("Martinez: ");
        int MVNJ = input.nextInt();
        wow.setAVNJ(AVNJ);
        wow.setMVNJ(MVNJ);
        System.out.print("Election results for Connecticut\nAwbrey: ");
        int AVCON = input.nextInt();
        System.out.print("Martinez: ");
        int MVCON = input.nextInt();
        wow.setAVCON(AVCON);
        wow.setMVCON(MVCON);
        wow.calc();
        System.out.print("Canidate\tVotes\tPercentage\nAwbrey\t"
                + wow.getAwbreyTotal()
                + "\t\t" + wow.getAPercent()
                + "\nMartinez\t"
                + wow.getMartinezTotal()
                + "\t\t" + wow.getMPercent()
                + "\nTotal votes\t  "
                + wow.getTotal());
    }
}
