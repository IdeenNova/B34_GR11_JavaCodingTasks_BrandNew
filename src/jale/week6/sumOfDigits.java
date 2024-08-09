package jale.week6;

public class sumOfDigits {




        //Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {

        System.out.println(sumOfDigit(1111));
        System.out.println(sumOfDigit(123));
    }

 public static int sumOfDigit(int n){

     int sum = 0;
     while (n != 0){

         sum += n % 10; // n % 10 gives the last digit
         n /= 10;
     }
     return sum;
 }
}
