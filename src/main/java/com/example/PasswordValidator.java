package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean ValidatePassword(String password) {
        String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[@#$%^&+=!])(?!.*[@#$%^&+=!].*[@#$%^&+=!]).{8,}$";
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
