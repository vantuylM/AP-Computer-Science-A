package Q2.LP3_10;

public class ClLP3_10 {
    private double myBurger;
    private double myFries;
    private double mySoda;
    private double myTotalBefore;
    private double myTax;
    private double myAmountGiven;
    private double myChange;
    private double myTotal;
    private double myTaxTotal;

    public ClLP3_10(int burger, int fries, int soda, double given){
        myAmountGiven = given;
        myBurger = burger;
        myFries = fries;
        mySoda = soda;
        myTotal = 0;
        myTaxTotal = 0;
    }
    public void calc(){
        myTotal = myBurger * 1.69 + myFries * 1.09 + mySoda * .99;
        myTax = myTotal * 0.065;
        myTaxTotal = myTax + myTotal;
        myChange = myAmountGiven - myTaxTotal;
    }
}
