package gr.aueb.cf.cf9.ch7;

public class StrIndexOf {

    public static void main(String[] args) {
        String cf = "Coding Factory";
        int positionOfo = cf.indexOf("o");     // 1   zero based
        System.out.println(positionOfo);

        int positionOfNexto = cf.indexOf("o", 2);  //θέση 11
        System.out.println(positionOfNexto);

        int positionOfLasto = cf.lastIndexOf("o");           //11
        System.out.println(positionOfLasto);

    }

    // Μέθοδος που επιστρέφει την κατάληξη του ονόματος ενός αρχείου
    // coding.txt
    public static String getExtension( String fileName){

        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}
