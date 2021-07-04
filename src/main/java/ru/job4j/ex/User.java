package ru.job4j.ex;

public class User {

    private static String userName;
    private static boolean valid;

    public User(String userName, boolean valid) {
        this.userName = userName;
        this.valid = valid;
    }

    public static String getUserName() {
        return userName;
    }

    public static boolean isValid() {
        return valid;
    }
}
