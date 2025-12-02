package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class NewSwitchApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int grade = 0;

        System.out.println(" Παρακαλούμε δώστε τον βαθμό. ");
        grade = scanner.nextInt();

        switch (grade) {
            case 1, 2, 3, 4 -> System.out.println("Κάτω από τη βάση.");
            case 5, 6 -> System.out.println(" Καλώς. ");
            case 7, 8 -> System.out.println(" Λίαν καλώς. ");
            case 9, 10 -> System.out.println(" Άριστα. ");
            default -> System.out.println(" Ο βαθμός πρέπει να είναι 1-10.");
        }
    }
}
