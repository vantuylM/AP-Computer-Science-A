package Q2.Prog402a;

public class Cl402a {
    private int myId;
    private int myScore;
    private double myDiff;

    public Cl402a(int id, int score){
        myId = id;
        myScore = score;
        myDiff = 0;
    }

    public void calc(){
        double average = myScore / 21;
               myDiff = myScore - average;
    }

    public String toString(){
        return myId + "\t" + myScore + "\t" + myDiff + "\n";
    }
}
