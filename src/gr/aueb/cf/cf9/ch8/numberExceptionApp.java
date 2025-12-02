package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class numberExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        int num = 0;
        System.out.println("Enter a number: ");
        //inputStr = scanner.nextLine();
        while (!isInteger((inputStr= scanner.nextLine()))){
            System.out.println("Οι χαρακτήρες είναι μη αποδεκτοί.");
        }

        num= Integer.parseInt(inputStr);
        System.out.println("Number is: " + num);

    }

    /**
     *checks if the given string is integer.
      */

    public static boolean isInteger(String s){
        return s.matches("-?[0-9]+");
    }
}
