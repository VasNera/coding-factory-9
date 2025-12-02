package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

public class StrConcat {

    public static void main(String[] args) {

        // Εισαγωγή δεδομένων.
        Scanner scanner = new Scanner(System.in);
        String firstname = "";
        int age = 0;
        String message = "";

        // Είσοδος και validation.
        System.out.println(" Please enter your first name: ");
        firstname = scanner.nextLine();

        System.out.println(" Please enter your age: ");
        while (!scanner.hasNextInt()){
            scanner.nextLine();
        }
        age = scanner.nextInt();

        // Καλεί μέθοδο.
        message = createMessage(firstname, age);

        //Εκτύπωση αποτελεσμάτων
        System.out.println(message);
    }

    /**
     * Create a message that contains the name and message of user.
     * @param firstname
     * @param age
     * @return
     */
    public static String createMessage(String firstname , int age){
        return String.format(" Hello, my name is  %s  and my age is  %d years old." , firstname, age);

    }
}
