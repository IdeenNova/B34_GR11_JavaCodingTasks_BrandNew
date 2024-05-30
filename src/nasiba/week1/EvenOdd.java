package nasiba.week1;

public class EvenOdd {
     public static void main(String[] args) {
          idenitify(5);
          idenitify(6);
     }
     public static void idenitify(int n){
          if(n % 2 == 0){
               System.out.println(n +" number is even");
          } else {
               System.out.println(n +" number is odd");
          }
     }


    /*
Write a method which can identifies given number is even or odd.
 Ex:
     idenitify(5) -> "Odd"
     idenitify(6) -> "Even"
 */



}