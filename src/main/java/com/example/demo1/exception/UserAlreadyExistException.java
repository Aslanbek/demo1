package com.example.demo1.exception;

/**
 * descr
 */
public class UserAlreadyExistException extends Exception {
    /**
     * descr
     * @param message text excp
     */
    public UserAlreadyExistException(String message) {
        super(message);
    }
}
