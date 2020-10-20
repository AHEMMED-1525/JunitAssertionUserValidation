package com.sample;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String Name_Pattern = "^[A-Z]{1}[a-z0-9]{2,}";
    private static final String Email_Pattern = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
    private static final String Mobile_Number = "^[0-9]{2} [0-9]{10}";
    private static final String Password_Pattern = "^[A-Za-z0-9]{8,}$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(Name_Pattern);
        return pattern.matcher(fname).matches();
    }

    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(Name_Pattern);
        return pattern.matcher(lname).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(Email_Pattern);
        return pattern.matcher(email).matches();

    }

    public boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(Mobile_Number);
        return pattern.matcher(mobileNumber).matches();
    }

    public boolean validatePassword(String pswrd) {
        Pattern pattern = Pattern.compile(Password_Pattern);
        return pattern.matcher(pswrd).matches();
    }
}
