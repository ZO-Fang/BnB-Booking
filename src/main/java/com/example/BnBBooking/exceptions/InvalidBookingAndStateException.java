package com.example.BnBBooking.exceptions;

public class InvalidBookingAndStateException extends  RuntimeException {
    public InvalidBookingAndStateException(String message) {
        super(message);
    }
}
