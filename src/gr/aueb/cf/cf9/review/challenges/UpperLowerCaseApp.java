package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Δοθέντος ενός String μετατρέπει σε κεφαλαία πεζά εναλλάξ.
 * Για παράδειγμα το coding -> CoDiNg
 */

public class UpperLowerCaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String inputStr = " ";
        char ch = ' ';

        // Είσοδος δεδομένων.
        System.out.println(" Εισάγετε ένα string ");
        inputStr = scanner.nextLine();

        // Επεξεργασία
        for (int i = 0; i < inputStr.length(); i++){
            ch = inputStr.charAt(i);
            if (Character.isLetter(ch)){
                ch = i % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                sb.append(ch);
            }
        }
        System.out.println(sb);

    }
}
