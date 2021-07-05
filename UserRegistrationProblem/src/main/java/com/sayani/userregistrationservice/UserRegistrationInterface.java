package com.sayani.userregistrationservice;

import com.sayani.exception.UserRegistrationException;

@FunctionalInterface
public interface UserRegistrationInterface {
    boolean validateEntries(String input) throws UserRegistrationException;
}
