package nayara_dbem.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse negative number and return it as int
    //ex: given int is ==> -53
    //  the output will be ==> -35

    public static StringBuilder reverseNegative(String n){ //-35

         StringBuilder reversed = new StringBuilder("");
         StringBuilder finalReversed = new StringBuilder("-");

         String noNegative = n.substring(1);

         //


        for (int i = noNegative.length()-1; i >= 0; i--) {
            char eachL = noNegative.charAt(i);
            reversed.append(eachL);

        }
        finalReversed.append(reversed);

        //finalReversed = Integer.parseInt(String.valueOf(reversed));
        return finalReversed;
    }

    public static void main(String[] args) {

        System.out.println(reverseNegative("-45"));
    }

}

