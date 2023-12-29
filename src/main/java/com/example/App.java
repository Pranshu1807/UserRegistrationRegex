package com.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        String regexPattern = "^[A-Z][a-zA-z]{2,}$";
        Pattern pattern = Pattern.compile(regexPattern);

        System.out.println("Enter a valid name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Matcher matcher = pattern.matcher(name);
        System.out.println(matcher.matches());

    }
}
