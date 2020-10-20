package com.sample;

import org.junit.Assert;
import org.junit.Test;

public class userValidation {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Ahemmed");
        Assert.assertEquals(true,result);
    }
    // Return false when proper name not given
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result2 = userValidator.validateFirstName("Ah");
        Assert.assertEquals(false, result2);
    }

}
