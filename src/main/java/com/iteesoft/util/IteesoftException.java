package com.iteesoft.util;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Optional;
import java.util.UUID;

@Getter
public class IteesoftException extends RuntimeException {

    private final ErrorMessage error;
    private static final String UNKNOWN_ERROR = "UNKNOWN_ERROR";

    public IteesoftException(int statusCode, String errorCode, String message, Throwable cause) {
        super(message, cause);
        String request = UUID.randomUUID().toString();
        this.error = ErrorMessageDto.builder()
                .code(Optional.ofNullable(errorCode).orElse(UNKNOWN_ERROR))
                .requestMarker(request)
                .statusCode(statusCode)
                .message(message)
                .build();
    }

    public IteesoftException(int statusCode, String errorCode, String message) {
        this(statusCode, errorCode, message, null);
    }

    public IteesoftException(ErrorMessage errorMessage) {
        super(errorMessage.getMessage());
        this.error = errorMessage;
    }

    public int getStatusCode() {
        return error != null ? error.getStatusCode() : HttpStatus.INTERNAL_SERVER_ERROR.value();
    }
}
