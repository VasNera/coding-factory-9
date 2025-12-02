package gr.aueb.cf.cf9.ch7;

/**
 * Concat becomes efficient with stringBuilder
 *
 */

public class StrBuilderApp {
    public static void main(String[] args) {

        String concatStr = "";
        long timeStart = 0L;
        long timeEnd = 0L;
        double elapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++){
            concatStr = concatStr + i;

        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;
        System.out.println("Elapsed Time : " +elapsedTime + " seconds ");

        //stringBuilder

        StringBuilder sb = new StringBuilder();
        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++){
            sb.append(i);                      // Έτσι συνενώνει. Δεν μπορείς να βάλεις +i

        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;
        System.out.println("Elapsed Time : " +elapsedTime + " seconds ");


    }



}
