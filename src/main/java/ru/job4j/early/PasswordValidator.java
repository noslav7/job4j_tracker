package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new NullPointerException("The password may not be null.");
        }

        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("The password length"
                    + " should not be inferior to 8 or exceed 32.");
        }

        char[] passwordChars = password.toCharArray();

        boolean atLeastOneUppercase = false;
        for (int i = 0; i < passwordChars.length; i++) {
            if (Character.isUpperCase(passwordChars[i])) {
                atLeastOneUppercase = true;
                break;
            }
        }
        if (!atLeastOneUppercase) {
            throw new IllegalArgumentException("At least one password"
                    + " letter should be an uppercase.");
        }

        boolean atLeastOneLowerCase = false;
        for (int i = 0; i < passwordChars.length; i++) {
            if (Character.isLowerCase(passwordChars[i])) {
                atLeastOneLowerCase = true;
                break;
            }
        }
        if (!atLeastOneLowerCase) {
            throw new IllegalArgumentException("At least one password"
                    + " letter should be a lowercase.");
        }

        boolean atLeastOneDigit = false;
        for (int i = 0; i < passwordChars.length; i++) {
            if (Character.isDigit(passwordChars[i])) {
                atLeastOneDigit = true;
                break;
            }
        }
        if (!atLeastOneDigit) {
            throw new IllegalArgumentException("At least one password letter"
                    + " should be a digit.");
        }

        boolean atLeastOneSpecChar = false;
        for (int i = 0; i < passwordChars.length; i++) {
            if (!Character.isDigit(passwordChars[i]) && !Character.isLetter(passwordChars[i])) {
                atLeastOneSpecChar = true;
                break;
            }
        }
        if (!atLeastOneSpecChar) {
            throw new IllegalArgumentException("At least one password symbol"
                    + " should be a special character.");
        }

        if (password.toLowerCase().contains("qwerty") || password.contains("12345")
                || password.toLowerCase().contains("password")
                || password.toLowerCase().contains("admin")
                || password.toLowerCase().contains("user")) {
            throw new IllegalArgumentException("The password may not "
                    + "contain overly simple substrings.");
        }

        return password;
    }
}
