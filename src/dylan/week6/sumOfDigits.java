package dylan.week6;

public class sumOfDigits {
    public static int digSum(String x){
        String[] arr = x.split("");
        int sum = 0;
        for (int i = 0; i < x.length(); i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digSum("12345"));
    }



        //Write a method that can return the sum of the digits in a string


}
