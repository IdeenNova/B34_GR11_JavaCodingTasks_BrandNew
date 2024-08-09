package jale.week7;

public class maxNumber {

    public static void main(String[] args) {

        int[] num = {5, 2, -1 , -2, 4, 1};

        System.out.println(maxNum(num));
    }
    public static int maxNum(int[] num){

        int max = num[0];
        for (int each : num){
            if (each > max){
                max = each;
            }

        }
        return max;

    }


}
