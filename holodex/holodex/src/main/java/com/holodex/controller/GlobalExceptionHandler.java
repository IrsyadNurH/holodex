package com.holodex.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleInternalServerError(Exception e) {
        return "error/500"; // Sesuaikan dengan halaman error yang Anda miliki
    }

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<String> handleResourceNotFoundException(ResponseStatusException e) {
        return ResponseEntity.status(e.getStatusCode()).body("Resource not found"); // Sesuaikan dengan respons yang Anda butuhkan
    }
}
