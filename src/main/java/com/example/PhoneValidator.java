package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {
    public static boolean ValidatePhone(String phone) {
        String phonePatter = "^[0-9]{2}+[\\s_]+[0-9]{10}$";
        Pattern pattern = Pattern.compile(phonePatter);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}
