package com.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String emailPattern = "^[a-zA-z0-9]{1,}[\\.+-]?[a-zA-z0-9]+@[a-zA-z0-9]{1,}(\\.[a-zA-z]{2,}){1,2}$";
        Pattern pattern2 = Pattern.compile(emailPattern);
        String[] emails = { "abc@yahoo.com", "abc-100@yahoo.com", "abc111@abc.com", "abc.100@yahoo.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc",
                "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
                "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
                "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

        for (String email : emails) {
            Matcher matcher2 = pattern2.matcher(email);
            System.out.println(matcher2.matches());
        }

    }
}
