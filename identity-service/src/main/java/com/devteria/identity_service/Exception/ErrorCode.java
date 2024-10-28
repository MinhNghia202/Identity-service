package com.devteria.identity_service.Exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999,"Uncategorized error"),
    USER_EXISTED(1001, "User already exist!"),
    USERNAME_INVALID(1002,"User must be at least 3 character!"),
    PASSWORD_INVALID(1003,"User must be at least 8 character")
    ;
    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
