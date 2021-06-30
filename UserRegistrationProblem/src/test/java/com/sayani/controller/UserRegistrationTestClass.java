/**
 * Purpose : Test cases for firstName, lastName, phoneNumber
 */

package com.sayani.controller;

import com.sayani.exception.UserRegistrationException;
import com.sayani.userregistrationservice.UserRegistrationImpl;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTestClass {
    UserRegistrationImpl userImpl = new UserRegistrationImpl();

    /**
     * Purpose : Validate First Name with first letter starting with capital and has minimum 3 characters in it.
     */

    @Test
    public void givenfirstName_IsValid() throws UserRegistrationException {
        try {
            Assert.assertTrue(userImpl.validateFirstName("Sayani"));
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenfirstName_IsInvalid() throws UserRegistrationException {
        try {
            userImpl.validateFirstName("sayani");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    /**
     * Purpose : Validate Last Name with first letter starting with capital and has minimum 3 characters in it.
     */

    @Test
    public void givenlastName_IsValid() throws UserRegistrationException {
        try {
            Assert.assertTrue(userImpl.validateLastName("Koley"));
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenlastName_IsInvalid() throws UserRegistrationException {
        try {
            userImpl.validateLastName("koley");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }

    /**
     * Purpose : Validate Phone Number with 0|91 in the beginning, followed by a white space, followed by 10 digit number.
     */

    @Test
    public void givenphonenumber_IsValid() {
        try {
            Assert.assertTrue(userImpl.validatePhoneNumber("0 7894561230"));
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenphonenumber_IsInvalid() {
        try {
            userImpl.validatePhoneNumber("01 59456123");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER, e.type);
        }
    }
}
