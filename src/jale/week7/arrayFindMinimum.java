package jale.week7;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    public static void main(String[] args) {

      int[] num = {5, 2, -1 , -2, 4, 1};

        System.out.println(minNum(num));
    }
    public static int minNum(int[] num){

        int min = num[0];
        for (int each : num){
            if (each < min){
                min = each;
            }

        }
        return min;

    }


}
