package Q2.Prog402a;

public class Cl402a {
    private int myId;
    private int myScore;
    private double myDiff;
    private double myAverage;
    private double myTotal;

    public Cl402a(int id, int score, double total){
        myId = id;
        myScore = score;
        myDiff = 0;
        myAverage = 0;
        myTotal = total;
    }

    public void calc(){
        myAverage = myTotal / 21;
        myDiff = myScore - myAverage;
    }

    public String toString(){
        return myId + "\t" + myScore + "\t" + myDiff + "\n";
    }
}
