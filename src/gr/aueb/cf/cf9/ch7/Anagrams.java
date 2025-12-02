package gr.aueb.cf.cf9.ch7;

/**
 * Anagrams are strings that have the same characters but in a different order.
 * for example , "Listen" and "silent" are anagrams.
 */

public class Anagrams {

    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s1, String s2){
        if (s1.length() != s2.length()) return false;

        int[] frequency = new int[256];        //full ascii
        for (char c : s1.toCharArray()){
            frequency[c]++;
        }

        for (char c : s2.toCharArray()){
            frequency[c]--;
            if (frequency[c] < 0) return false;      //early exit.
        }
        // all counts are 0.
        return true;
    }
}
