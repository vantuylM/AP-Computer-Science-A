package Q1;

public class Prog122c {
    public static void main(String[] args) {
        int a = 0;
        while(a < 10) {
            a += 2;
            System.out.print(a+"\t"+(a+1)+"\t"+(a*2+"\t"+(a*a)+"\n"));
        }
    }
}
/*
2	3	4	4
4	5	8	16
6	7	12	36
8	9	16	64
10	11	20	100
 */