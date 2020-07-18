package com.pub.text.enums;

import java.text.MessageFormat;

/**
 * could be in resource bundle
 */
public enum ErrorMessage {
    NULL_ARGUMENTS("Args must not be null, first argument is type of align and the second is the width"),
    INVALID_NUMBER_OF_ARGS("Two arguments are required, align type and width"),
    INVALID_ALIGN_TYPE("Align type is not valid: {0}"),
    INVALID_WIDTH("Width is not valid: {0}");

    private String message;
    ErrorMessage(String msg){
        message = msg;
    }

    public String getMessage() {
        return message;
    }
    public String format(Object ... args){
        return MessageFormat.format(this.getMessage(),args);
    }
}
