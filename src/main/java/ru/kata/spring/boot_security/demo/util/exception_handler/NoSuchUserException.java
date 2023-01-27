package ru.kata.spring.boot_security.demo.util.exception_handler;

public class NoSuchUserException extends RuntimeException {
    public NoSuchUserException(String message) {
        super(message);
    }
}
