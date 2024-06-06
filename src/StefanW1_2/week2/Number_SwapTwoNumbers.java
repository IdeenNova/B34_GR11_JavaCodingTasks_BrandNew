package StefanW1_2.week2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Number_SwapTwoNumbers {

    /*
    Swap two variables' values without using a third variable
     */

    //solution 1

    public static void main(String[] args) {

        System.out.println(Arrays.toString(swapTwoNumbers(255, 15)));
    }

    public static int[] swapTwoNumbers(int x, int y) {

        x = x + y;
        y = x - y;
        x = x - y;

        return new int[]{x, y};
    }
}
