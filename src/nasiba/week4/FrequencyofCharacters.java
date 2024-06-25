package nasiba.week4;

import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static void main(String[] args) {
         frequencyOfChars("AAABBCDD");


    }
    public static void frequencyOfChars(String str){

        Map<Character,Integer> counter = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
           char eachChar = str.charAt(i);
            System.out.println(eachChar);

           if(!counter.containsKey(eachChar)){
               counter.put(eachChar,0);
           }
           counter.put(eachChar,counter.get(eachChar)+1);

        }
        System.out.println(counter);
    }

}
