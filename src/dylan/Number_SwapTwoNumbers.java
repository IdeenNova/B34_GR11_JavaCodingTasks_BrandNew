package dylan;

public class Number_SwapTwoNumbers {
    public static void swapNum(int a, int b){
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        swapNum(2, 3);
        swapNum(7, 3);
        swapNum(20, 30);
    }

    /*
    Swap two variables' values without using a third variable
     */

    //solution 1

}
