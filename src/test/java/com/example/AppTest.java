package com.example;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {

    public static Map<String, Integer> Freq = new HashMap<String, Integer>();

    @ParameterizedTest
    @ValueSource(strings = { "Pranshu", "PraNshu", "PraPRsad", "Prr" })
    public void happyTestName(String firstName) {
        try {
            NameValidator.ValidateName(firstName);
        } catch (InvalidName e) {
            fail("Name is Invalid");
        }

    }

    @ParameterizedTest
    @ValueSource(strings = { "pranshu", "9pranshu", "P", "1231-p" })
    public void sadTestName(String lastName) {
        try {
            NameValidator.ValidateName(lastName);
            fail("Expected Invalid Name");
        } catch (InvalidName e) {
            assertEquals("Name is Invalid", e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "abc@yahoo.com", "abc-100@yahoo.com",
            "abc111@abc.com", "abc.100@yahoo.com",
            "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
            "abc+100@gmail.com" })
    public void happyEmails(String email) {
        try {
            EmailValidator.ValidateEmail(email);
        } catch (InvalidEmail e) {
            fail("Email is not Valid");
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "abc",
            "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a", "abc@gmail.com.aa.au" })
    public void sadEmails(String email) {
        try {
            EmailValidator.ValidateEmail(email);
            fail("Expected an Invalid Email");
        } catch (InvalidEmail e) {
            assertEquals("Email is Invalid", e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "91 9580281173", "90 1234567890", "90 1111111111" })
    public void happyPhone(String phone) {
        try {
            PhoneValidator.ValidatePhone(phone);
        } catch (InvalidPhone e) {
            fail("Phone number is not valid");
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "91 580281173", " 901234567890", "90 11111111112", "9 1234567890" })
    public void sadPhone(String phone) {
        try {
            PhoneValidator.ValidatePhone(phone);
            fail("Expected an Invalid Phone Number");
        } catch (InvalidPhone e) {
            assertEquals("Phone Number is not Valid", e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "Pranshu@1807", "pra@nshuR1", "PRANS1234#",
            "pranshu12870123#1P" })
    public void happyPassword(String password) {
        try {
            PasswordValidator.ValidatePassword(password);

        } catch (InvalidPassword e) {
            fail("Password is not valid");
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "Pranshu1807", "pra@nshu1", "PRANSHUdada#",
            "pranshu12870123#1P@", "P1@fifi" })
    public void sadPassword(String password) {
        try {
            PasswordValidator.ValidatePassword(password);
            fail("Expected an Invalid Password");
        } catch (InvalidPassword e) {
            assertEquals("Password is not valid", e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "abc@yahoo.com", "abc-100@yahoo.com",
            "abc111@abc.com", "abc@1.com",
            "abc-100@abc.net", "abc.100@abc.com.au", "abc@a1.com", "abc@gmail.com.com",
            "abc+100@gmail.com" })
    public void duplicateEmail(String email) {
        Freq.put(email, Freq.getOrDefault(email, 0) + 1);
        assertEquals(true, Freq.get(email) == 1);
    }
}
