package jale.week3;

public class primeNumber {
     /*
        Write a method that can check if a number is prime or not

        Prime number is only divisible by 1 and itself
     */

    public static void main(String[] args) {

        System.out.println("isPrime(7) = " + isPrime(7));
        System.out.println("isPrime(6) = " + isPrime(6));
        System.out.println("isPrime(1) = " + isPrime(1));
    }

    public static boolean isPrime(int n){

        if (n < 2){
            return false;
        }

        for (int i = 2; i < n; i++){

            if (n % i == 0){
                return false;
            }
        }

        return true;
    }

}
