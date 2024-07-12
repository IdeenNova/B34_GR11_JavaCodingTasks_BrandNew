package jake.week6;

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

    public static boolean validatePassword(String password) {
        // first, verify password length is at least 6 characters and does not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsDigit = false;
        boolean containsSpecialChar = false;

        // Iterate through each character of the password
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                containsUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                containsLowerCase = true;
            } else if (Character.isDigit(ch)) {
                containsDigit = true;
            } else if (Character.isLetterOrDigit(ch)) {
                containsSpecialChar = true;
            } else if (!Character.isLetterOrDigit(ch)) { // use "!Character" since special character is neither a letter or a digit
                    containsSpecialChar = true;
            }else{
                return false;
            }
        }

        // check if all conditions are satisfied
        return containsUpperCase && containsLowerCase && containsDigit && containsSpecialChar;
    }

    // use main method to call validatePassword method to apply code to validate/invalidate password
    public static void main(String[] args) {
        String password = "sTeeL3r$";
        boolean isValid = validatePassword(password);
        System.out.println("This password is valid: " + isValid);
    }
}


