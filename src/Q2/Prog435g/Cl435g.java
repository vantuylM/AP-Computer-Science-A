package Q2.Prog435g;

public class Cl435g {
    private int myScore;
    private int myRank;

    public Cl435g(int Score) {
        myScore = Score;
        myRank = 0;
    }

    public void setRank(int Rank) { myRank = Rank; }
    public String toString() { return myScore + "\t\t" + myRank; }
}
