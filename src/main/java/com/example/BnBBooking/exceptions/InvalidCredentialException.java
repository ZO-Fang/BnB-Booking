package com.example.BnBBooking.exceptions;

public class InvalidCredentialException extends RuntimeException {
    public InvalidCredentialException(String message) {
        super(message);
    }
}
