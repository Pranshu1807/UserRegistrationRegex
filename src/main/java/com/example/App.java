package com.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namePattern = "^[A-Z][a-zA-z]{2,}$";
        Pattern pattern = Pattern.compile(namePattern);
        System.out.println("Enter a valid first name");
        String firstname = sc.nextLine();
        Matcher matcher = pattern.matcher(firstname);
        System.out.println(matcher.matches());

        System.out.println("Enter a valid Last name");
        String lastName = sc.nextLine();
        matcher = pattern.matcher(lastName);
        System.out.println(matcher.matches());

        String emailPattern = "^[A-Za-z][A-Za-z0-9._%+-]*@[A-Za-z]+\\.[a-zA-Z]{2,}$";
        Pattern pattern2 = Pattern.compile(emailPattern);
        System.out.println("Enter the email");
        String email = sc.nextLine();
        Matcher matcher2 = pattern2.matcher(email);
        System.out.println(matcher2.matches());

    }
}
