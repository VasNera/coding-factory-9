package gr.aueb.cf.cf9.ch5;

/**
 *  Demo του Method overloading. Σημαίνει ίδιο όνομα μεθόδου,
 *  με διαφορετικές παραμέτρους.
 *  Method signature = είναι το όνομα και οι παράμετροι. Δεν μπορούμε να
 *  έχουμε το ίδιο όνομα και παραμέτρους.
 */
public class MethodOverloading {

    public static void main(String[] args) {

        int sum1 = 0;
        long sum2 = 0L;
        int sum3 = 0;


        sum1= add(10 , 20);
        sum2 = add(10L ,20L);
        sum3 = add(10,20,30);

        System.out.println("sum1 = "+ sum1);
        System.out.println("sum2 =" + sum2);
        System.out.println("sum 3 = "+ sum3);

    }

    public static int add(int num1, int num2) {
        return num1 + num2;

    }
    // Άν έχουν ίδιο όνομα αλλά άλλες παραμέτρους μπορούμε και τότε αυτό λέγεται overloading.

    public static long add(long num1, long num2) {
        return num1 + num2;

    }

    public static int add(int num1, int num2, int num3) {
        return  num1 + num2 + num3;

    }
}


