package com.Ricky.phonebook.model;

import lombok.AllArgsConstructor;

import java.net.URI;
import java.util.Date;

@AllArgsConstructor
public class ErrorHandler {
    private Date timestamp;
    private int status;
    private String error;
    private String message;
    private URI path;
}
