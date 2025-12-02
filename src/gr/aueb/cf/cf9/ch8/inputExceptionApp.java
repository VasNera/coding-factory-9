package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class inputExceptionApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;


        System.out.println("Εισάγετε έναν ακέραιο: ");
        //num = scanner.nextInt();
        while(!scanner.hasNextInt()) {

            System.out.println("Μη αποδεκτοί χαρακτήρες. ");
            scanner.nextLine();

        }

        num= scanner.nextInt();
        System.out.println("num: " + num);
    }
}
