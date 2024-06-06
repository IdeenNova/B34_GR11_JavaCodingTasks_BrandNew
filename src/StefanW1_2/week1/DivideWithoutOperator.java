package StefanW1_2.week1;

public class DivideWithoutOperator {
    /*
Write a method that can divide two numbers without using division operator
*/
    public static void main(String[] args) {

        int dividend = 15;
        int divisor = 6;
        int result = divide(dividend, divisor);
        System.out.println(dividend + " divided by " + divisor + " is " + result + " with a reminder of " + dividend % divisor);
    }
        public static int divide(int dividend, int divisor) {

            if (divisor == 0) {
                return 0;
            }

            boolean isNegative = (dividend < 0) || (divisor < 0);

            //Absolute value of dividend and divisor (handling negative numbers).
            int absoluteDividend = Math.abs(dividend);
            int absoluteDivisor = Math.abs(divisor);

            int quotient = 0;

            while (absoluteDividend >= absoluteDivisor) { // 15 , 5  |  10 , 5 | 5 , 5 | 0 , 5
                absoluteDividend -= absoluteDivisor;  // dividend = dividend - divisor 10 , 5 | 5 , 5 | 0 , 5
                quotient++; // 1 | 2 | 3
            }

            if(isNegative) {
                return -quotient;
            }else{
                return quotient;
            }
        }
}


