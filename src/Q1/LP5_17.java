package Q1;
import java.util.*;

public class LP5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int c = 0;
        int d = 0;
        String password = "NateTheGreat";
        while (c != 3 && a != 1){
            System.out.print("Enter Password: ");
            String b = input.nextLine();
            if (b.equals(password)){
                System.out.print("Password correct!");
                a++;
            }else if (!b.equals(password)){
                c++;
                d++;
            }else if (d == 3){
                System.out.print("Access denied!");
            }
        }System.out.print("Access denied!");
    }
}
/*
Enter Password: hello
Enter Password: hi
Enter Password: hey
Access denied!
 */
