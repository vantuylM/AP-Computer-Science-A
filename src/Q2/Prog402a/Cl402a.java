package Q2.Prog402a;

public class Cl402a {
    private int myId;
    private int myScore;
    private double myDiff;
    private double myAverage;

    public Cl402a(int id, int score){
        myId = id;
        myScore = score;
        myDiff = 0;
        myAverage = 0;
    }

    public void calc(){
        myAverage = myScore / 21;
        myDiff = myScore - myAverage;
    }

    public String toString(){
        return myId + "\t" + myScore + "\t" + myDiff + "\n";
    }
}
