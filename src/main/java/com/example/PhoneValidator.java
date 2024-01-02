package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {
    public static boolean ValidatePhone(String phone) throws InvalidPhone {
        String phonePatter = "^[0-9]{2}+[\\s_]+[0-9]{10}$";
        Pattern pattern = Pattern.compile(phonePatter);
        Matcher matcher = pattern.matcher(phone);
        if (!matcher.matches())
            throw new InvalidPhone("Phone Number is not Valid");
        return true;
    }
}

class InvalidPhone extends Exception {
    public InvalidPhone(String s) {
        super(s);
    }
}
