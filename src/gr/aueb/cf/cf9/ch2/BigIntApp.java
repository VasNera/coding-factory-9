package gr.aueb.cf.cf9.ch2;

import java.math.BigInteger;


/**
 * Big integer demo
 */


public class BigIntApp {

    public static void main(String[] args) {

        System.out.println();

        BigInteger bigNum1 = new BigInteger("547857488963265");
        BigInteger bigNum2 = new BigInteger("574954733142645");
        BigInteger bigResult;

        bigResult = bigNum1.add(bigNum2);

        System.out.printf("The result is: %,d\n", bigResult);

    }
}
