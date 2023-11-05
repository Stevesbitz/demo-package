package com.iteesoft.util;

public interface ErrorMessage {

    int getStatusCode();

    String getCode();

    String getMessage();

    java.util.Map<String, Object> getData();

    String getRequestMarker();

}

