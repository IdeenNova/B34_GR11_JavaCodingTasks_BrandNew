package nayara_dbem.week6;

import java.util.Arrays;


public class FindMaximum {
    //Write a method that can find the maximum number from an int Array


    public static int  maxNumber(int[] list){

   int maxNumber = 0;

    Arrays.sort(list);

    maxNumber = list[(list.length) - 1];

      return maxNumber;
    }

    public static void main(String[] args) {

       int[] result = {1,2,4,34,3,6,7,3,4};
        System.out.println(maxNumber(result));

    }
}
