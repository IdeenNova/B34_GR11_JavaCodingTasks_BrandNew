package dylan.week1;

public class Even_Odd {
    /*
Write a method which can identifies given number is even or odd.
 Ex:
     idenitify(5) -> "Odd"
     idenitify(6) -> "Even"
 */
    public static void main(String[] args) {
        identify(3);
    }
    public static void identify(int num){
        if (num % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
