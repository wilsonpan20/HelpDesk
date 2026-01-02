package com.willdev.hdcommonslib.models.responses.models.exceptions;

public class JWTCustomException extends RuntimeException {
    public JWTCustomException(String message) {
        super(message);
    }
}
