package nayara_dbem.week4;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
     /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static String removeDuplicates(String str) {
        // LinkedHashSet maintains insertion order and removes duplicates

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        // Construct the resultant string by joining characters in the set
        StringBuilder sb = new StringBuilder();
        for (Character character : set) {
            sb.append(character);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates("adadeebb"));


    }
}
