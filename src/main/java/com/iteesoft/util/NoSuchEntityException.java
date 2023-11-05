package com.iteesoft.util;

public class NoSuchEntityException extends BadRequestException {
    public NoSuchEntityException(String message) {
    }
    public NoSuchEntityException(String name, String message, Throwable err) {
    }
}
