package nasiba.week5;

import java.util.HashMap;
import java.util.HashSet;

public class findUnique {
    /*String -- Find the unique
    Write a return method that can find the unique characters from the String
     Ex: unique("AAABBBCCCDEF") ==> "DEF"") ==> "DEF";*/
    public static void main(String[] args) {

        System.out.println("findDuplicateChars(\"AAABBBCCCDEF\") = " + findDuplicateChars("AAABBBCCCDEF"));
        System.out.println("findUniqueChars(\"AAABBBCCCDEF\") = " + findUniqueChars("AAABBBCCCDEF"));

    }


public  static HashSet<Character> findDuplicateChars(String str){
    // create a HashSet to store unique chars
    HashSet<Character> uniqueChars = new HashSet<>();

    // iterate through the string and add characters to the HashSet
    for(int i = 0; i < str.length(); i++){
        uniqueChars.add(str.charAt(i));
    }
    return uniqueChars;
}


public  static String findUniqueChars(String str){
        // create a HashMap to count of each character
    HashMap<Character,Integer> charCountMap = new HashMap<>();

    // Iterate through the string and count each char
    for (int i = 0; i< str.length(); i++){
        char c = str.charAt(i);
        charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);

    }
    // Use StringBuilder to store unique Char
    StringBuilder uniqueChars = new StringBuilder();

    // Iterate through the map and append characters with a count of 1 to the StringBuilder
    for (int i = 0; i<str.length();i++){
        char c = str.charAt(i);
        if (charCountMap.get(c)==1){
            uniqueChars.append(c);
        }
    }
return uniqueChars.toString();

}
}
