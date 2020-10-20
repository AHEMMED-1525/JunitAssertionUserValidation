package com.sample;

import org.junit.Assert;
import org.junit.Test;

public class userValidation {
    // Validation Test for First name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Ahemmed");
        Assert.assertEquals(true,result);
    }

    //Testing  Last name validation

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validateLastName("Lucky");
        Assert.assertEquals(true,result);
    }
    // Validation Testing for Email Id


    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator=new UserValidator();
        boolean result=userValidator.validateEmail("abc@gmail.com");
        Assert.assertEquals(true,result);
    }

    // Validation Test for Mobile Pattern

    @Test
    public void givenMobileNumber_WhenProper_ReturnTrue() {
        UserValidator mobilenumvalidator=new UserValidator();
        boolean result=mobilenumvalidator.validateMobileNumber("91 7730851594");
        Assert.assertTrue(result);
    }
}
