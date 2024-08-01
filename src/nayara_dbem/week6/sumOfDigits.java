package nayara_dbem.week6;

public class sumOfDigits {




        //Write a method that can return the sum of the digits in a string

    public static int sumOfDigits(String n){

        int count = 0;

        for (int i = 0; i <= n.length(); i++) {

            count+=i;

        }

        return count;
    }

    public static void main(String[] args) {

        String x = "Nayara";

        System.out.println(sumOfDigits(x));
    }

}
