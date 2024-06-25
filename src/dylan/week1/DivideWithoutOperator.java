package dylan.week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        divideTwoNums(1, 3);
    }

    /*
Write a method that can divide two numbers without using division operator

 */
    public static void divideTwoNums(int num1, int num2) {
        if (num2 == 0) {
            System.err.println("Can Not Divide by Zero");
        }
        int count = 0;
        int dividend = num2;
        while(num2 > num1){
            num2 -= num1;
            count++;
        }

        System.out.println(dividend + " divided by " + num1 + " equals "
        + count + " with a remainder of " + num2);

    }
}
