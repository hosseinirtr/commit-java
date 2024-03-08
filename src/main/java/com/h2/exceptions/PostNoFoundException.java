package com.h2.exceptions;

public class PostNoFoundException extends RuntimeException{
    public PostNoFoundException(String message) {
        super(message);
    }

    public PostNoFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
