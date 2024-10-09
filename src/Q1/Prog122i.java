package Q1;

public class Prog122i {
    public static void main(String[] args) {
        int a = -26;
        //double cube = a*a*a;
        //double cuberoot = Math.pow(cube, 0.25);
        System.out.print("Number\t\tCube Root\t\t Cube");
        while (a<=24) {
            a++;
            double cube = a*a*a;
            double cuberoot = Math.pow(cube, 0.25);
            System.out.print("\n"+a+"\t\t\t"+cuberoot+"\t\t\t"+cube);
        }
    }
}
