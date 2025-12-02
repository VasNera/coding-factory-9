package gr.aueb.cf.cf9.ch6;

/**
 * Ορίζει ένα δισδιάστατο πίνακα και κάνει populate τον array( γεμίζει με στοιχεία δλδ)
 * Οι 2d πίνακες ορίζονται κατά γραμμή και στήλη.
 */

public class ArrayTwoDim {

    public static void main(String[] args) {
        int[][] grid = new int[2][3];     // 2 γραμμές 3 στήλες.

        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;
        grid[1][0] = 4;
        grid[1][1] = 5;
        grid[1][2] = 6;
                //Δεύτερος τρόπος γεμίσματος πίνακα.
        int[][] grid2 = {{1,2,3}, { 4 ,5 ,6}};

        for (int i = 0 ; i < grid.length ; i++){
            for (int j = 0; j < grid[i].length; j ++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
//        for (int[] row : grid){
//            for (int el : row){
//                System.out.print(el +" ");
//            }
//            System.out.println();
//
//        }

    }
}
