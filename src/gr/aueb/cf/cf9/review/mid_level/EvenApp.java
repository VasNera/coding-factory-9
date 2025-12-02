package gr.aueb.cf.cf9.review.mid_level;

public class EvenApp {
    public static void main(String[] args) {
        int num = 0;
        boolean result = isEven(num);
        System.out.println(result);
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
