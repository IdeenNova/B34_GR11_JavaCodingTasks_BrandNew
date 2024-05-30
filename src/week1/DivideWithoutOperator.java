package week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {
divide(6,2);
    }
public static void divide (int num1,int num2){
if (num2 == 0){
    System.out.println("Divider can not be zero");
    return;

     }
int count = 0;
String result = num1 + "/"+ num2 + " is ";

while (num1 >= num2){
    count++;
    num1 -= num2;


}
    System.out.println(count);
    System.out.println(result + count + " reminder "+ num1);

}

    /*
Write a method that can divide two numbers without using division operator

 */

// adding new package
}
