package nayara_dbem.week4;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

    public static boolean checkString(String toCheck,String checkedString ){


        boolean result = true;

        if (toCheck.length() != checkedString.length()){
            return false;
        }

        for (int i = 0; i < toCheck.length(); i++) {
            for (int j = 0; j < checkedString.length(); j++) {

                if (toCheck.charAt(i) != checkedString.charAt(j)){
                    result = false;
                }
                if (toCheck.charAt(i) == checkedString.charAt(j)){
                    result = true;
                    break;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(checkString("nayara", "yarana"));
    }


}
