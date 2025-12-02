package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου. π.χ Αν ο ακέραιος είναι
 * ο 178 το πλήθος των ψηφίων είναι 3.
 */
public class DigitsApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int digits = 0;
        int inputNum = 0;

        System.out.println(" Insert the number:");
        num = scanner.nextInt();
        inputNum=num;
        do{
            digits++;
            num /=10;

        } while (num >0);

        System.out.println(" The number of digits " + inputNum +" are: " + digits);
    }
}
