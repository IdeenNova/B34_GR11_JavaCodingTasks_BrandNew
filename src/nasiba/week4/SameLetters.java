package nasiba.week4;

import java.util.Arrays;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/
    public static void main(String[] args) {
        System.out.println(areAnagrams("abc",  "cab"));// true

        System.out.println(areAnagrams("abc",  "abb"));// false
    }

public static boolean areAnagrams(String str1,String str2){

    if(str1.length() != str2.length()){
        return false;
    }
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

      return Arrays.equals(arr1,arr2) ;
}

}
