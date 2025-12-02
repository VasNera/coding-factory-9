package gr.aueb.cf.cf9.ch3;
/**
 * The user inserts the temperature, and the status of isRaining
 * variable and calculates if it is snowing or not. If it is raining and the temperature
 * is below 0, it is snowing.
 */

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temperature = 0;

        System.out.println( "Παρακαλώ εισάγετε αν βρέχει(true/false)");
        isRaining = scanner.hasNextBoolean();
        System.out.println("Παρακαλώ εισάγετε τη θερμοκρασία");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature<0); //short-Circuit Operator

        System.out.println("Is snowing:" +isSnowing);



    }
}
