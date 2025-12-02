package gr.aueb.cf.cf9.review.challenges;

public class missingElement {
    public static void main(String[] args) {

    }

    public static int findMissingElement(int[]arr){
        int expectedSum = 0;
        int actual = 0;
        int n = 0;

        n = arr.length;
        expectedSum = (n *(n + 1)) / 2;
        for (int item: arr){
            actual += item;

        } return expectedSum - actual;
    }
}
