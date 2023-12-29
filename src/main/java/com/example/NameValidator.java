package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator {
    public static boolean ValidateName(String name) {
        String namePattern = "^[A-Z][a-zA-z]{2,}$";
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
