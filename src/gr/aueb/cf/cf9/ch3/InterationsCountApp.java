package gr.aueb.cf.cf9.ch3;
/**
 * Όσο το num δεν είναι -1 να μπαίνει. Όταν δωθεί -1 να βγεί.
 */

import java.util.Scanner;

public class InterationsCountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int interations = 0;

        System.out.println(" Please give the number:");
        num = scanner.nextInt();

        while (num != -1){
            interations++;
            System.out.println(" Please give the number:");
            num = scanner.nextInt();

        }
        System.out.println("The count of interation is:" +interations);
    }
}
