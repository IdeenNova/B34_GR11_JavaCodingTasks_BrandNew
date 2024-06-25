package dylan.week3;

public class primeNumber {
     /*
        Write a method that can check if a number is prime or not
     */
    public static void primeCheck(int n){
        boolean check = true;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && i != n){
                check = false;
            }
        }
        System.out.println(check);
    }

    public static void main(String[] args) {
        primeCheck(5);
        primeCheck(10);
        primeCheck(13);
        primeCheck(3000);
    }
}
