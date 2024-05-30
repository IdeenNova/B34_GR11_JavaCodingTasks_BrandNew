package nayara_dbem;

public class EvenOddSolution {

       /*
Write a method which can identifies given number is even or odd.
 Ex:
     idenitify(5) -> "Odd"
     idenitify(6) -> "Even"
 */

    public static void identifyNum(int num){

        if (num%2==0){
            System.out.println( num + " is an even number.");
        }else{
            System.out.println(num + " is an odd number.");
        }
    }

    public static void main(String[] args) {


        int num = 10;
        int num1 = 6;

        identifyNum(num);
        identifyNum(num1);
        identifyNum(6);

    }
}
