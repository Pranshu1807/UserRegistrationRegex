package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean ValidateEmail(String email) {
        String emailPattern = "^[a-zA-z0-9]{1,}[\\.+-]?[a-zA-z0-9]+@[a-zA-z0-9]{1,}(\\.[a-zA-z]{2,}){1,2}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
