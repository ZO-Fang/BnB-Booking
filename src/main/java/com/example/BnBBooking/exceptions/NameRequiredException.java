package com.example.BnBBooking.exceptions;

public class NameRequiredException extends RuntimeException{
    public NameRequiredException(String message){
        super(message);
    }
}
