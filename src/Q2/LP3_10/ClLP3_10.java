package Q2.LP3_10;

public class ClLP3_10 {
    private int myBurger;
    private int myFries;
    private int mySoda;
    private double myTotalBefore;
    private double myTax;
    private double myAmountGiven;
    private double myChange;
    private double myTotal;
    private double myTaxTotal;

    public ClLP3_10(int burger, int fries, int soda){
        myBurger = burger;
        myFries = fries;
        mySoda = soda;
    }
    //public ClLP3_10(double given){
        //myAmountGiven = given;
    //}
    public void calc(){
        myTotal = myBurger * 1.69 + myFries * 1.09 + mySoda * .99;
        myTax = myTotal * 0.065;
        myTaxTotal = myTax + myTotal;
        myChange = myAmountGiven - myTaxTotal;
    }
    public double getTotal() { return myTotal; }
    public double getTax() { return myTax; }
    public double getTaxTotal() { return myTaxTotal; }
    public double getChange() { return myChange; }
    public void setGiven(double given) { myAmountGiven = given; }
}
