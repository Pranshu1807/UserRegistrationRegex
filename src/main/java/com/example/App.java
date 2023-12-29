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

        String phonePatter = "^[0-9]{2}+[\\s_]+[0-9]{10}$";
        Pattern pattern3 = Pattern.compile(phonePatter);
        System.out.println("Enter the phone number");
        String phone = sc.nextLine();
        Matcher matcher3 = pattern3.matcher(phone);
        System.out.println(matcher3.matches());

        String passwordPattern = "^(?=.*[A-Z]).{8,}$";
        Pattern pattern4 = Pattern.compile(passwordPattern);
        System.out.println("Enter the Password");
        String password = sc.nextLine();
        Matcher matcher4 = pattern4.matcher(password);
        System.out.println(matcher4.matches());

    }
}
