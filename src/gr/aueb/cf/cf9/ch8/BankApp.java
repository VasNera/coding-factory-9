package gr.aueb.cf.cf9.ch8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *  Η {@Link BankApp} παρέχει μια μόνο υπηρεσία.
 *  Την υπηρεσία κατάθεσης.
 */

public class BankApp {
    static double balance = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 0.0;

        try {
            System.out.println("Please enter an amount: ");
            amount = scanner.nextDouble();
            deposit(amount);
            System.out.println("Το υπόλοιπο μετά τη κατάθεση είναι: " + amount);


        } catch (Exception e) {
            System.err.println("Δεν μπορεί να γίνει κατάθεση αρνητικού ποσού.");
        }
    }
    public static void deposit(double amount)throws Exception{
        try {
            if (amount < 0) throw new Exception("Amount cannot be negative");
            balance += amount;
        } catch (Exception e){
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage());   //logging
            throw e;      //re-throwing the exception
        }


    }
}
