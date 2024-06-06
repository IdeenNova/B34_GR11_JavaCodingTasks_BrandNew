package nayara_dbem.week3;

public class primeNumber {
     /*
        Write a method that can check if a number is prime or not
     */

    public static boolean isPrime(int num){ //8

        for (int i = 2; i < num; i++) {

            if (num % i == 0){
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(6));
        System.out.println(isPrime(4));
        System.out.println(isPrime(7));
    }
}
