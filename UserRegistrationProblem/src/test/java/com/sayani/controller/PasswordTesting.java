package com.sayani.controller;

import com.sayani.userregistrationservice.UserRegistrationImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PasswordTesting {
    public String password;
    public Boolean expectedResult;

    public PasswordTesting(String password, boolean expectedResult) {
        this.password = password;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][] {
                { "Aby%1234", true } ,                         //atleast 1 uppercase, atleast 1 numeric value, exactly 1 special character, minimum length is 8
                { "Aby%123", false } ,                         // minimum length is not 8
                { "aby%1234", false } ,                        // does not have atleast 1 upper case value
                { "aBy%abc", false } ,                         // does not have atleast 1 numeric value
                { "aBy%#1234", false } ,                       // does not have exact 1 special character
        } );
    }

    /**
     * Purpose : Validate Password using regex
     * Condition: Length should have minimum 8 characters in it.
     * Return true if the string value passes else return false
     */

    @Test
    public void givenPassword_shouldReturnTrueOrFalse() {
        UserRegistrationImpl userImpl = new UserRegistrationImpl();
        boolean result = userImpl.validatePassword(this.password);
        Assert.assertEquals(expectedResult, result);
    }
}
