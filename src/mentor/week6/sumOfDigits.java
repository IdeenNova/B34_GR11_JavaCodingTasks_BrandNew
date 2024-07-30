package mentor.week6;

import java.util.Arrays;

public class sumOfDigits {

    public static int stringSum(String x){
        int sum = 0;
        String[] dig = x.split("");
        for (int i = 0; i < dig.length; i++) {
            sum += Integer.parseInt(dig[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(stringSum("1234"));
    }

        //Write a method that can return the sum of the digits in a string


}
