package com.cedaniel200.screenplay.exceptions;

public class AuthenticateException extends AssertionError {

    public AuthenticateException(String message, Throwable cause) {
        super(message, cause);
    }
}
