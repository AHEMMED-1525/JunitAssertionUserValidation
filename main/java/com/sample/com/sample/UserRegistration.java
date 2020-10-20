package com.sample.com.sample;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String EMAIL_Pattern = "^[A-Za-z0-9]+([-\\.\\+\\_]{1}[0-9A-Za-z]+)*@[A-Za-z0-9]+.[a-zA-Z]{2,4}([\\.\\,]{1}[a-z]{2,3}){0,1}$";
    public boolean validateEmail(String emailTest) {
        Pattern pattern = Pattern.compile(EMAIL_Pattern);
        return pattern.matcher(emailTest).matches();
    }
}
