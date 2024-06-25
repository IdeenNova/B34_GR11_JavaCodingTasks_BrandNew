package nasiba.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse negative number and return it as int
    //ex: given int is ==> -53
    //  the output will be ==> -35

    public static void main(String[] args) {
        System.out.println(reversInt(-53));
    }
public static int reversInt(int n ){
    int rev = 0;

    while (n < 0){
        int lastDigit = n % 10;
        rev = rev * 10 + lastDigit;
      n /= 10;
    }
    return rev;
}
}

