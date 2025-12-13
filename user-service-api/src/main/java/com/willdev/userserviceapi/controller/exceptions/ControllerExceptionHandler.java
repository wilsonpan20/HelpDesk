package com.willdev.userserviceapi.controller.exceptions;

import com.willdev.hdcommonslib.models.exceptions.ResourceNotFoundException;
import com.willdev.hdcommonslib.models.exceptions.StandardError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    ResponseEntity<StandardError> handleNotFoundException(final ResourceNotFoundException ex, final HttpServletRequest request) {

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(StandardError.builder().timestamp(LocalDateTime.now()).status(HttpStatus.NOT_FOUND.value()).error(HttpStatus.NOT_FOUND.getReasonPhrase()).message(ex.getMessage()).path(request.getRequestURI()).build());
    }

}
