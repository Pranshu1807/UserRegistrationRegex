package com.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regexPattern = "^[A-Z][a-zA-z]{2,}$";
        Pattern pattern = Pattern.compile(regexPattern);

        System.out.println("Enter a valid first name");
        String firstname = sc.nextLine();
        Matcher matcher = pattern.matcher(firstname);
        System.out.println(matcher.matches());

        System.out.println("Enter a valid Last name");
        String lastName = sc.nextLine();
        matcher = pattern.matcher(lastName);
        System.out.println(matcher.matches());

    }
}
