package com.icaropaixao.helpdesk.services.exceptions;

public class ObjectnotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ObjectnotFoundException(String message) {
        super(message);
    }
    public ObjectnotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
