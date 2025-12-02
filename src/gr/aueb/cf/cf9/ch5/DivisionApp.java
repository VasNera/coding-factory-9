package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1 = 0.0;
        double num2 = 0.0;
        double result = 0.0;
        double remaining = 0.0;

        System.out.println(" Βάλτε δυο αριθμούς.");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        result = num1 / num2;                       // Διαίρεση δεκαδικών είναι δεκαδικός και διαίρεση με 0 δεν δίνει error αλλά infinity.

        remaining = num1 % num2;                    // Το υπόλοιπο της διαίρεσης είναι το υπόλοιπο της διαίρεσης με το ακέραιο μέρος.

        System.out.println(" result = " + result);
        System.out.println("remaining =" + remaining);

    }
}
