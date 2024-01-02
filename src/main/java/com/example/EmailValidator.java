package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean ValidateEmail(String email) throws InvalidEmail {
        String emailPattern = "^[a-zA-z0-9]{1,}[\\.+-]?[a-zA-z0-9]+@[a-zA-z0-9]{1,}(\\.[a-zA-z]{2,}){1,2}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches())
            throw new InvalidEmail("Email is Invalid");
        return true;
    }
}

class InvalidEmail extends Exception {
    public InvalidEmail(String s) {
        super(s);
    }
}
