package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerMethodApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = 0;
        int power = 0;
        int result = 1;
        System.out.println(" Enter two numbers ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result *= powerMethod(base , power);


        System.out.println(" Το αποτέλεσμα είναι: " + result);

    }
    public static int powerMethod ( int a , int b){

        int result = 1;

        for ( int i = 1; i <= b; i++) {
            result  *= i;
        }
        return  result;


    }
}
