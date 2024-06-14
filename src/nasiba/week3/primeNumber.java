package nasiba.week3;

public class primeNumber {
    /*
       Write a method that can check if a number is prime or not
    */
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(6));
        System.out.println(isPrime(11));
        System.out.println(isPrime(10));
        System.out.println(isPrime(0));
    }


    public static boolean isPrime(int n) {
        if (n < 2 ){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }

        return true;
    }
}

