package com.julie_meme.lesson2;

public class WrongSignException extends Exception {

    public WrongSignException() {
    }

    public WrongSignException(String message) {
        super(message);
    }

    public WrongSignException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongSignException(Throwable cause) {
        super(cause);
    }

    public WrongSignException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

