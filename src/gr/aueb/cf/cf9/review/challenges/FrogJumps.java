package gr.aueb.cf.cf9.review.challenges;

public class FrogJumps {
    public static void main(String[] args) {

    }

    public static int frogJumps(int start , int end , int jump){
        int jumpCount = 0;

        while(start < end){
            start +=jump;
            jumpCount++;

        } return jumpCount;
    }

    public  static int frogJumps2(int start, int end, int jump){
        return(int)Math.ceil((end - start) / (double) jump);
    }
}
