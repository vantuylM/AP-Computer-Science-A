package Q2.Prog402a;

public class Cl402a {
    private int myId;
    private int myScore;
    private double myDiff;
    private double myAverage;
    private double myTotal;

    public Cl402a(int Id, int score) {
        myId = Id;
        myScore = score;
        //myTotal =
    }

    public void getId(int id) { myId = id; }
    public void getScore(int score) { myScore = score; }

    public void calc(){
        myAverage = myTotal / 21;
        myDiff = myScore - myAverage;
    }

    public String toString(){
        return myId + "\t" + myScore + "\t" + myDiff + "\n";
    }
}
