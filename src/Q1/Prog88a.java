package Q1;

public class Prog88a {
    public static void main(String[] args) {
        // Enter number 1-13
        // Enter number 2-20
        // Math.random() * (max - min) + min
        int num1 = (int) (Math.random() * (13 - 1)) + 1;
        int num2 = (int) (Math.random() * (20 - 2)) + 2;
        int sum = num1 + num2;
        int dif = num1 - num2;
        // TODO: product and average
        int product = num1 * num2;
        int avg = (num1 + num2) / 2;
        int abs = Math.abs(dif);
        int max, min;

        // the code inside 'if' will only run if the condition is true
        if (num1 > num2) {
            max = num1;
            // min = num2;
        } else { //otherwise...
            max = num2;
            // min = num1;
        }

        // check is 'max' and 'num1' are the same value using ==
        if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }

        System.out.println("Original numbers are " + num1 + " and " + num2);
        //TODO: print the rest
        System.out.println("The product is " + product);
        System.out.println("The average is " + avg);
        System.out.println("Maximum = " + max);
        System.out.println("minimum = " + min);
    }
}
