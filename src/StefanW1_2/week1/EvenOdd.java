package StefanW1_2.week1;

public class EvenOdd {
    /*
Write a method which can identifies given number is even or odd.
Ex:
    idenitify(5) -> "Odd"
    idenitify(6) -> "Even"
*/
    public static void main(String[] args) {

        identifyOddEven(3);
        identifyOddEven(3);

    }

    public static void identifyOddEven(int n) {

        if (n % 2 == 0) {
            System.out.println("This number is: " + "Even");
        } else
            System.out.println("This number is: " + "Odd");

    }
}

