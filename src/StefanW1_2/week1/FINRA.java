package StefanW1_2.week1;

public class FINRA {
     /*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
 */
     public static void main(String[] args) {

         finra();
     }

     public static void finra(){
         int n = 30;
         int number = 1;

         do {
             if (number % 3 == 0 && number % 5 == 0) {
                 System.out.print("FINRA ");
             } else if (number % 3 == 0) {
                 System.out.print("FIN ");
             } else if (number % 5 == 0) {
                 System.out.print("RA ");
             }else{
                 System.out.print(number + " ");
             }
             number++;

         } while (number <= n);
     }
}
