public class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialCharacters = "!@#$%^&*()-+";

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (specialCharacters.contains(String.valueOf(c))) {
                hasSpecial = true;
            }

            if (hasLowercase && hasUppercase && hasDigit && hasSpecial) {
                break;
            }
        }

        if (!(hasLowercase && hasUppercase && hasDigit && hasSpecial)) {
            return false;
        }

        for (int i = 1; i < password.length(); i++) {
            if (password.charAt(i) == password.charAt(i - 1)) {
                return false;
            }
        }

        return true;
    }
}
