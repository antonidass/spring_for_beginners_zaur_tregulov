package com.akrik.spring.rest.exception_handler;

public class NoSuchObjException extends RuntimeException{
    public NoSuchObjException(String message) {
        super(message);
    }
}
