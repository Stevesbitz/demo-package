package com.iteesoft.util;

import lombok.Getter;

@Getter
public enum ErrorType {
    /**
     * The user's has one or more unresolved offence with high severity
     */
    CONTACT_CX_TEAM("Please contact CX team to resolve your blacklist status"),

    NO_SUCH_USER("Invalid phoneNumber number or email address");
    private String message;

    ErrorType(String message) {
        this.message = message;
    }

}

