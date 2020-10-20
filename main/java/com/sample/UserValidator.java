package com.sample;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String Name_Pattern = "^[A-Z]{1}[a-z0-9]{2,}";
    private static final String Email_Pattern = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
    private static final String Mobile_Number = "^[0-9]{2} [0-9]{10}";
    private static final String Password_Pattern = "^[A-Za-z0-9+#!$@]{8,}$";
    private static final String Password_Pattern_Upper = "^[A-Za-z0-9+#!$@]{8,}$";
    private static final String Special_Char = "^(?=.*\\d)(?=.*[A-Z])(?=.*[@#!$%]).{8,20}$";


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

    public boolean validatePasswordSpecialChar(String pswrd) {
        Pattern pattern=Pattern.compile(Special_Char);
        return pattern.matcher(pswrd).matches();
    }

    public boolean validatePasswordUpperCase(String pswdUpper) {
        Pattern pattern = Pattern.compile(Password_Pattern_Upper);
        return pattern.matcher(pswdUpper).matches();
    }
}
