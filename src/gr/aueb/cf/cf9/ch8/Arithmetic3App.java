package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class Arithmetic3App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int result = 0;

        while (true) {
            System.out.println("enter two numbers: ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            if (num1 == 0) {
                System.out.println("error");
                continue;
            }


            if (num2 == 0) {
                System.out.println("Error");
                continue;

            }

            result = num1 / num2;
            System.out.println("result:" + result);
        }
    }
}