/**
 * Purpose : User Registration
 *           User will input firstName, lastName, phoneNumber, email, password
 *           Validate the user inputs using regex
 *           If matches, return true else false
 *
 * @author : SAYANI KOLEY
 * @since : 29.06.2021
 */

package com.sayani.controller;

import com.sayani.userregistrationmodel.UserRegistration;
import com.sayani.userregistrationservice.UserRegistrationImpl;
import com.sayani.userregistrationutil.Util;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistrationImpl impl = new UserRegistrationImpl();
        UserRegistration userRegistration = null;
        Util utility = new Util();
        boolean flag = false;

        //User will input firstName, lastName, phoneNumber, email, password
        System.out.println("Please enter the following details");
        userRegistration = utility.userMenu();

        //Validate First Name using REGEX
        flag = impl.validateName(userRegistration.getFirstName());
        if(flag)
            System.out.println("First Name is valid");
        else
            System.out.println("First Name is invalid");

        //Validate Last Name using REGEX
        flag = impl.validateName(userRegistration.getLastName());
        if(flag)
            System.out.println("Last Name is valid");
        else
            System.out.println("Last Name is invalid");

        //Validate Mobile Number using REGEX
        flag = impl.validatePhoneNumber(userRegistration.getMobileNumber());
        if(flag)
            System.out.println("Mobile Number is valid");
        else
            System.out.println("Mobile Number is invalid");

        //Validate Email Address using REGEX
        flag = impl.validateEmail(userRegistration.getEmailAddress());
        if(flag)
            System.out.println("Email is valid");
        else
            System.out.println("Email is invalid");

        //Validate Password using REGEX
        flag = impl.validatePassword(userRegistration.getPassword());
        if(flag)
            System.out.println("Password is valid");
        else
            System.out.println("Password is invalid");
    }
}
