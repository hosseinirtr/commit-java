package com.h2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {
    @ExceptionHandler({PostNoFoundException.class})
    public ResponseEntity<Object> handlePostNotFoundException ( PostNoFoundException  postNoFoundException){
        AppException appException = new AppException(postNoFoundException.getMessage(), postNoFoundException.getCause(),HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(appException, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler({ClientNoFoundException.class})

    public ResponseEntity<Object> handleClientNotFoundException ( ClientNoFoundException  clientNoFoundException){
        AppException appException = new AppException(clientNoFoundException.getMessage(), clientNoFoundException.getCause(),HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(appException, HttpStatus.NOT_FOUND);
    }

}
