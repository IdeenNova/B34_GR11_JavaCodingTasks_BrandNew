package nayara_dbem.week6;

public class SumOfDigits2 {


    public static int sumOfDig(String n){ //2345

        int sum = 0;

        for (int i = 0; i < n.length(); i++) {

           char eachDig = n.charAt(i);

            int digits = Integer.parseInt(String.valueOf(eachDig));

            sum+=digits;
        }

        return sum;
    }

    public static void main(String[] args) {


        String x = "2583";

        System.out.println(sumOfDig(x));
    }
}
