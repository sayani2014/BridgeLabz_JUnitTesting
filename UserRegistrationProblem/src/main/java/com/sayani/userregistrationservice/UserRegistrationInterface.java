package com.sayani.userregistrationservice;

import com.sayani.exception.UserRegistrationException;

@FunctionalInterface
public interface UserRegistrationInterface<T extends Comparable<T>> {
    boolean validateEntries(String input) throws UserRegistrationException;
}
