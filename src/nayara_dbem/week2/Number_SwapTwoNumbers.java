package nayara_dbem.week2;

public class Number_SwapTwoNumbers {

    /*
    Swap two variables' values without using a third variable
     */

    //solution 1

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 3;

        num1+=num2; //8

        num2 = num1-num2;// 5
        num1 = num1 - num2; // 3


        System.out.println("Num1 is: " + num1);
        System.out.println("Num2 is: " + num2);
    }

}
