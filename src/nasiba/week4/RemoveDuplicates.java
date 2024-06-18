package nasiba.week4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
     /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
     public static void main(String[] args) {

         System.out.println("removeDup(\"AAABBBCCC\") = " + removeDup("AAABBBCCC"));

     }

public static String removeDup(String str) {

    Set<Character> setCharacters  = new LinkedHashSet<>();
    StringBuilder result = new StringBuilder();

    for (char eachChar : str.toCharArray()){
        if(!setCharacters.contains(eachChar)){
            setCharacters.add(eachChar);

            System.out.println(eachChar + " eachChar");
            result.append(eachChar);
        }
    }
    return result.toString();
    }
}
