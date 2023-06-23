package com.example.demo1.exception;

/**
 * my excp
 */
public class UserNotFoundException extends Exception {
    /**
     * dexcr
     * @param message text
     */
    public UserNotFoundException(String message) {
        super(message);
    }
}
