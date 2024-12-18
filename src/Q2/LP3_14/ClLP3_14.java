package Q2.LP3_14;

public class ClLP3_14 {
    private int myNYAwbrey;
    private int myNJAwbrey;
    private int myNYMartinez;
    private int myNJMartinez;
    private int myConAwbrey;
    private int myConMartinez;
    private double myAPercentage;
    private double myMPercentage;
    private int myTotalVoters;
    private int myAwbreyTotal;
    private int myMartinezTotal;

    public ClLP3_14(int AVNY, int MVNY) {
        myNYAwbrey = AVNY;
        myNYMartinez = MVNY;
    }

    public void calc(){
        myTotalVoters = myNYAwbrey + myNYMartinez + myNJAwbrey + myNJMartinez + myConMartinez + myConAwbrey;
        myAwbreyTotal = myNYAwbrey + myNJAwbrey + myConAwbrey;
        myMartinezTotal = myNYMartinez + myNJMartinez + myConMartinez;
        myAPercentage = myAwbreyTotal / myTotalVoters;
        myMPercentage = myMartinezTotal / myTotalVoters;
    }

    public void setAVCON(int AVCON) { myConAwbrey = AVCON; }
    public void setMVCON(int MVCON) { myConMartinez = MVCON; }
    public void setAVNJ(int AVNJ) { myNJAwbrey = AVNJ; }
    public void setMVNJ(int MVNJ) { myNJMartinez = MVNJ; }
}
