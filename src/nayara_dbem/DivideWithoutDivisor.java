package nayara_dbem;

public class DivideWithoutDivisor {


    /*
Write a method that can divide two numbers without using division operator

 */

    public static String divide(int divisor, int dividend) {

        int quotient = 1;

        if (divisor == 0) {
            System.err.println("Do not allow 0");
        }

        while (dividend > divisor){

            dividend -= divisor;

            if (dividend == 0 || dividend < divisor){
                break;
            }
            quotient++;
        }

        return quotient + " with a remainder " + dividend;
    }

    public static void main(String[] args) {


        String result = divide(4,30);

        System.out.println(result);
    }
}
