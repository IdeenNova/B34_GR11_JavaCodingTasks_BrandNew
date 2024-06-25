package dylan.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse negative number and return it as int
    //ex: given int is ==> -53
    //  the output will be ==> -35
    public static int revNum(int n){
        String temp = "";
        String temp2 = "";
        temp = String.valueOf(n);
        for (int i = temp.length()-1; i > 0; i--) {
            temp2 += temp.charAt(i);
        }
        return -1 * Integer.parseInt(temp2);
    }

    public static void main(String[] args) {
        System.out.println(revNum(-53));
        System.out.println(revNum(-123123));
    }
}

