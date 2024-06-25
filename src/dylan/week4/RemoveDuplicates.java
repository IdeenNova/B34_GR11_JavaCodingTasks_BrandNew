package dylan.week4;



public class RemoveDuplicates {
     /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
    public static String removeDup(String n){
        String ans = "" + n.charAt(0);
        for (int i = 1; i < n.length(); i++) {
            if (!ans.contains("" + n.charAt(i))){
                ans += n.charAt(i);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("ABAABBBCCCCCCDDDDAASD"));
    }

}
