package gr.aueb.cf.cf9.review.mid_level;

public class ArrayMax {
    public static void main(String[] args) {

        int[]arr = {4 , 5 , 7, 8, 9, 13};
        int max = findMax(arr);
        System.out.println(max);

    }
    public static int findMax(int[]arr) {
        if (arr == null || arr.length == 0)return Integer.MIN_VALUE;

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

        } return max;

    }
}
