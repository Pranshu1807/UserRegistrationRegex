package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {

    @ParameterizedTest
    @ValueSource(strings = { "Pranshu", "PraNshu", "PraPRsad", "Prr" })
    public void happyTestName(String firstName) {
        assertEquals(true, NameValidator.ValidateName(firstName));
    }

    @ParameterizedTest
    @ValueSource(strings = { "pranshu", "9pranshu", "P", "1231-p" })
    public void sadTestName(String lastName) {
        assertEquals(false, NameValidator.ValidateName(lastName));
    }

    @ParameterizedTest
    @ValueSource(strings = { "abc@yahoo.com", "abc-100@yahoo.com", "abc111@abc.com", "abc.100@yahoo.com",
            "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" })
    public void happyEmails(String email) {
        assertEquals(true, EmailValidator.ValidateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = { "abc",
            "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
            "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
            "abc@gmail.com.1a", "abc@gmail.com.aa.au" })
    public void sadEmails(String email) {
        assertEquals(false, EmailValidator.ValidateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = { "91 9580281173", "90 1234567890", "90 1111111111" })
    public void happyPhone(String phone) {
        assertEquals(true, PhoneValidator.ValidatePhone(phone));
    }

    @ParameterizedTest
    @ValueSource(strings = { "91 580281173", " 901234567890", "90 11111111112", " 9 1234567890" })
    public void sadPhone(String phone) {
        assertEquals(false, PhoneValidator.ValidatePhone(phone));
    }

    @ParameterizedTest
    @ValueSource(strings = { "Pranshu@1807", "pra@nshuR1", "PRANS1234#", "pranshu12870123#1P" })
    public void happyPassword(String password) {
        assertEquals(true, PasswordValidator.ValidatePassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = { "Pranshu1807", "pra@nshu1", "PRANSHUdada#", "pranshu12870123#1P@","P1@fifi" })
    public void sadPassword(String password) {
        assertEquals(false, PasswordValidator.ValidatePassword(password));
    }
}
