package com.android.lsj.exception;

public class LsjException extends Exception {
    private int errorCode;

    private String orgResponse;

    public LsjException(String errorMessage) {
        super(errorMessage);
    }

    public LsjException(int errorCode,String errorMessage) {
        super(errorMessage);
    }

    public LsjException(int errorCode, String errorMessage, String orgResponse) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.orgResponse = orgResponse;
    }

    public LsjException(LsjError error) {
        super (error.getMessage());
        this.errorCode = error.getErrorCode();
        this.orgResponse = error.getOrgResponse();
    }

    public String getOrgResponse() {
        return orgResponse;
    }

    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String toString() {
        return "errorCode:" + this.errorCode + "\nerrorMessage:" + this.getMessage()
                + "\norgResponse:" + this.orgResponse;
    }
}
