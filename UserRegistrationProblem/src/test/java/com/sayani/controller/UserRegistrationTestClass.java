/**
 * Purpose : Test cases for firstName, lastName, phoneNumber, email, password
 */

package com.sayani.controller;

import com.sayani.userregistrationservice.UserRegistrationImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTestClass {
    UserRegistrationImpl userImpl = new UserRegistrationImpl();

    /**
     * Purpose : Validate First Name with first letter starting with capital and has minimum 3 characters in it.
     * Return true if the string value passes else return false
     */

    @Test
    public void givenfirstName_Proper_ShouldReturnTrue() {
        boolean result = userImpl.validateName("Sayani");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenfirstName_Proper_ShouldReturnFalse() {
        boolean result = userImpl.validateName("sayani");
        Assertions.assertFalse(result);
    }

    /**
     * Purpose : Validate Last Name with first letter starting with capital and has minimum 3 characters in it.
     * Return true if the string value passes else return false
     */

    @Test
    public void givenlastName_Proper_ShouldReturnTrue() {
        boolean result = userImpl.validateName("Koley");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenlastName_Proper_ShouldReturnFalse() {
        boolean result = userImpl.validateName("koley");
        Assertions.assertFalse(result);
    }
}
