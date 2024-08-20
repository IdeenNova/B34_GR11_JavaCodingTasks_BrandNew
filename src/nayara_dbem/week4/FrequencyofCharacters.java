package nayara_dbem.week4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/


    public static String frequencyOfChars(String sentence) { //"bbccdddaaammm"

        Map<Character, Integer> map = new LinkedHashMap<>();


        for (int i = 0; i < sentence.length(); i++) {
            char key = sentence.charAt(i);

            if (!map.containsKey(key)){
                map.put(key, 0);

            }
            map.put(key, map.get(key) + 1);
        }


        return map.toString();
    }

    public static void main(String[] args) {

        System.out.println(frequencyOfChars("aaafffrrrtttww"));
    }
}
