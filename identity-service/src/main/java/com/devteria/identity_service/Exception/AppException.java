package com.devteria.identity_service.Exception;

public class AppException extends RuntimeException{
    private ErrorCode errorCode;

    public AppException(String message, ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
