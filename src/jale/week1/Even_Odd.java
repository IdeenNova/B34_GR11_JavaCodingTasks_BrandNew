package jale.week1;

public class Even_Odd {


    /*
Write a method which can identifies given number is even or odd.
 Ex:
     idenitify(5) -> "Odd"
     idenitify(6) -> "Even"
 */
    public static void main(String[] args) {

        evenOrOdd(28);
        evenOrOdd(33);

    }

    public static void evenOrOdd(int num){


        if (num % 2 == 0){
            System.out.println("even");
        }else if (num % 2 != 0)
        System.out.println("odd");


    }


}
