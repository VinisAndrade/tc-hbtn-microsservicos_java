package com.example.user.exception;


public class UserIdException extends RuntimeException {
    public UserIdException(String message) {
        super(message);
    }
}

public class UserNameException extends RuntimeException {
    public UserNameException(String message) {
        super(message);
    }
}

public class CPFException extends RuntimeException {
    public CPFException(String message) {
        super(message);
    }
}