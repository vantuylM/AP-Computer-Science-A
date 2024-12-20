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
        System.out.printf("Canidate\tVotes\tPercentage\nAwbrey\t\t%d\t\t%.2f\nMartinez\t%d\t\t%.2f\nTotal votes\t  %d",
                wow.getAwbreyTotal(), wow.getAPercent(), wow.getMartinezTotal(), wow.getMPercent(), wow.getTotal());
    }
}

/*
Election results for New York
Awbrey: 314159
Martinez: 271860
Election results for New Jersey
Awbrey: 89008
Martinez: 121032
Election results for Connecticut
Awbrey: 213451
Martinez: 231034
Canidate	Votes	Percentage
Awbrey		616618		49.71
Martinez	623926		50.29
Total votes	  1240544
 */