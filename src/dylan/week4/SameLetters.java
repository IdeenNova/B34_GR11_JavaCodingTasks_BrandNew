package dylan.week4;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/
    public static Boolean same(String a, String b){
        String[] x = a.split("");
        String[] y = b.split("");
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));
        System.out.println(same("abc", "abb"));
    }
}
