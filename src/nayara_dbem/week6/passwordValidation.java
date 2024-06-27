package nayara_dbem.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static boolean validatePassaword(String password) {

        if ((password.length() < 6) || password.contains(" ")) {
            return false;
        }
        // Check for at least one uppercase letter
        boolean hasUpperCase = false;
        // Check for at least one lowercase letter
        boolean hasLowerCase = false;
        // Check for at least one digit
        boolean hasDigit = false;
        // Check for at least one special character
        boolean hasSpecialChar = false;

        // Iterate through each character of the password
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                // Assuming special characters are numbers
                if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialChar = true;
                }
            }
        }
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

        public static void main (String[]args){


            String password = "Vitoria234!";
            String wrongPassword = "thaafkl2";
            String wrongPassword2 = "TTRCGJJKˆ%%67";

            System.out.println(validatePassaword(password));
            System.out.println(validatePassaword(wrongPassword));
            System.out.println(validatePassaword(wrongPassword2));

        }

}




