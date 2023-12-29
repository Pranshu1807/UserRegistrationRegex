package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a valid first name");
        // String firstname = sc.nextLine();
        // System.out.println(NameValidator.ValidateName(firstname));

        // System.out.println("Enter a valid Last name");
        // String lastName = sc.nextLine();
        // System.out.println(NameValidator.ValidateName(lastName));

        // System.out.println("Enter the email");
        // String email = sc.nextLine();
        // System.out.println(EmailValidator.ValidateEmail(email));

        // System.out.println("Enter the phone number");
        // String phone = sc.nextLine();
        // System.out.println(PhoneValidator.ValidatePhone(phone));

        System.out.println("Enter the Password");
        String password = sc.nextLine();
        System.out.println(PasswordValidator.ValidatePassword(password));

    }
}
