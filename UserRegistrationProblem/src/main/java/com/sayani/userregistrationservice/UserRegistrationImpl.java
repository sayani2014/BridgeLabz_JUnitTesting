package com.sayani.userregistrationservice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImpl {

    /**
     * Purpose : Validate the user inputs for first name and last name using regex
     *           If matches, return true else false
     * Condition : First letter starting with capital and has minimum 3 characters in it.
     * @param : firstName & lastName
     * @return : true or false
     */

    public boolean validateName( String name ) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);

        if(name.isEmpty())
            return false;

        Matcher m = p.matcher(name);
        return m.matches();
    }

    /**
     * Purpose : Validate the user inputs for email using regex
     *           If matches, return true else false
     * Condition : should have @ symbol.
     * @param : email
     * @return : true or false
     */

    public boolean validateEmail( String email ) {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9-]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
        Pattern p = Pattern.compile(regex);

        if(email.isEmpty())
            return false;

        Matcher m = p.matcher(email);
        return m.matches();
    }

    /**
     * Purpose : Validate the user inputs for phone number using regex
     *           If matches, return true else false
     * Condition : 0/91, followed by space, 10 digit number
     * @param : number
     * @return : true or false
     */

    public boolean validatePhoneNumber( String number ) {

        String regex = "(0|91)?[\s][0-9]{10}";
        Pattern p = Pattern.compile(regex);

        if(number.isEmpty())
            return false;

        Matcher m = p.matcher(number);
        return m.matches();
    }

    /**
     * Purpose : Validate the user inputs for password using regex
     *           If matches, return true else false
     * Condition : Minimum 8 characters
     *             Should have atleast 1 upper case
     *             Should have atleast 1 numeric number
     *             Should have exactly 1 special character
     * @param : password
     * @return : true or false
     */

    public boolean validatePassword( String password ) {

        String regex = "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        Pattern p = Pattern.compile(regex);

        if(password.isEmpty())
            return false;

        Matcher m = p.matcher(password);
        return m.matches();
    }
}
