package mentor.week1;

public class EvenOdd {
     /*
Write a method which can identifies given number is even or odd.
 Ex:
     idenitify(5) -> "Odd"
     idenitify(6) -> "Even"
 */
     public static void main(String[] args) {
          //Write  a method which can identifies given number is even or odd

          identifyOddEven(5);
          identifyOddEven(6);

     }
     public  static  void  identifyOddEven( int  n ) {
          if(n%2==0){
               System.out.println("even");}
          else{
               System.out.println("odd");}
     }
}
