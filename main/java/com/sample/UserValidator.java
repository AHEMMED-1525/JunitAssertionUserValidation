package com.sample;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String Name_Pattern = "^[A-Z]{1}[a-z0-9]{2,}";
    private static final String Email_Pattern="^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(Name_Pattern);
        return pattern.matcher(fname).matches();
    }


    public boolean validateLastName(String lname) {
        Pattern pattern=Pattern.compile(Name_Pattern);
        return pattern.matcher(lname).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern=Pattern.compile(Email_Pattern);
        return pattern.matcher(email).matches();

    }
}
