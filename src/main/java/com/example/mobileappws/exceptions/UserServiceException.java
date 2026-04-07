package com.example.mobileappws.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = 40L;

    public UserServiceException(String message) {
        super(message);
    }
}
