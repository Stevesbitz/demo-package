package com.iteesoft.util;

import org.springframework.http.HttpStatus;

public class BadRequestException extends IteesoftException {
    public BadRequestException() {
        this(null, null, null);
    }

    public BadRequestException(String message) {
        this(null, message, null);
    }

    public BadRequestException(String message, Throwable cause) {
        this(null, message, cause);
    }

    public BadRequestException(String errorCode, String message, Throwable cause) {
        super(HttpStatus.BAD_REQUEST.value(), errorCode, message, cause);
    }

}
