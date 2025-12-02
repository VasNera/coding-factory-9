package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class StrIO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        String str2 = "";

        System.out.println("Please enter two strings:");
        str = scanner.next();
        str2 = scanner.nextLine();
    }
}
