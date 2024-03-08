package com.h2.exceptions;

public class ClientNoFoundException extends RuntimeException{
    public ClientNoFoundException(String message) {
        super(message);
    }

    public ClientNoFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
