package dylan.week4;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static String FrequencyOfChars(String n){
        String temp = "";
        for (int i = 0; i < n.length()-1; i++) {
            int count = 1;
            char check = n.charAt(i);
            for (int j = i + 1; j < n.length(); j++) {
                if (n.charAt(j) == check){
                    count++;
                }
                else{
                    break;
                }
            }
            i += count - 1;
            temp += "" + check + count;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AAAAAABBBBCDDDDDDD"));
    }

}
