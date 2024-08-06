package dylan.week6;

public class passwordValidation {
    /*String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false
*/
    public static Boolean pmv(String x){
        if (x.length() <= 6){
            return false;
        }
        if (x.contains(" ")){
            return false;
        }
        if (!x.matches(".*[A-Z].*")){
            return false;
        }
        if (!x.matches(".*[a-z].*")){
            return false;
        }
        if (!x.matches(".*[!@#$%^&*(){}|:<>?/].*")){
            return false;
        }
        if (!x.matches(".*[0-9].*")){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(pmv("abcdv"));
        System.out.println(pmv("12391248"));
        System.out.println(pmv("Abcas*123"));
    }



}
