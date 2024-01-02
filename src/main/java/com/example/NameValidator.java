package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator {
    public static boolean ValidateName(String name) throws InvalidName {
        String namePattern = "^[A-Z][a-zA-z]{2,}$";
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(name);
        boolean isValid = matcher.matches();
        if (!isValid)
            throw new InvalidName("Name is Invalid");
        return true;
    }
}

class InvalidName extends Exception {
    public InvalidName(String s) {
        super(s);
    }
}
