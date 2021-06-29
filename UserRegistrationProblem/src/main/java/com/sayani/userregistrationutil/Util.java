/**
 * Purpose : User inputs for firstName, lastName, phoneNumber, email, password
 *           set the values in UserRegistration properties
 *
 * @return : UserRegistration object to get the property values
 */

package com.sayani.userregistrationutil;

import com.sayani.userregistrationmodel.UserRegistration;

import java.util.Scanner;

public class Util {
    public UserRegistration userMenu() {
        Scanner input = new Scanner(System.in);
        UserRegistration user = new UserRegistration();

        System.out.print("Enter First Name: ");
        user.setFirstName(input.next());

        System.out.print("Enter Last Name: ");
        user.setLastName(input.next());

        System.out.print("Enter Phone Number: ");
        user.setMobileNumber(input.next());

        System.out.print("Enter Password: ");
        user.setPassword(input.next());

        System.out.print("Enter Email Address: ");
        user.setEmailAddress(input.next());

        return user;
    }
}
