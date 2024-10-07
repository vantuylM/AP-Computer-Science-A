package Q1;

public class Prog122a {
    public static void main(String[] args) {
        int a = 1; /*"number \t\t square \t\t square root*/
        int square = 0;
        double SquareRoot = 0;
        int Square = 0;
        while (a <= 50) {
            Square = a * a;
            SquareRoot = Math.sqrt(a);
            //System.out.print("number \t\t square \t\t square root \n" + a + "\t\t" + Square + "\t\t" + SquareRoot);
        }
        System.out.println("\n" + a + "\t\t" + Square + "\t\t" + SquareRoot);
    }
}
