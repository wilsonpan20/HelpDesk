package com.willdev.hdcommonslib.models.responses.models.exceptions;

public class RefreshTokenExpired extends RuntimeException {
    public RefreshTokenExpired(String message) {
        super(message);
    }
}
