package com.example.configureswagger.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN )
public class EmptyTableException extends Exception{
    public EmptyTableException(String message) {
        super(message);
    }
}
