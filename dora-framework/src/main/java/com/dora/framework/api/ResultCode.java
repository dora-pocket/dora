package com.dora.framework.api;

public enum ResultCode {

    SUCCESS("200", "成功"),
    CODE_500("500", "系统异常");

    private String code;
    private String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }


}
