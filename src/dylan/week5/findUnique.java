package dylan.week5;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

public class findUnique {
    /*String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";*/
    public static String unique(String x){
        String ans = "";

        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            char temp = x.charAt(i);
            for (int j = 0; j < x.length(); j++) {
                if (x.charAt(j) == temp){
                    count++;
                }
            }
            if (count == 1){
                ans += x.charAt(i);
            }
            count = 0;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }
}
