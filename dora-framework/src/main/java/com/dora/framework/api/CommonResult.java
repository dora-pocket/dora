package com.dora.framework.api;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonResult {
    private String code;
    private String message;
    private Object payload;

    public CommonResult(String code, String message, Object payload) {
        this.code = code;
        this.message = message;
        this.payload = payload;
    }

    public static CommonResult success(){
        return  new CommonResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(),null);
    }


    public static CommonResult success(Object payload){
        return new CommonResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(),payload);
    }


    public static CommonResult error(String code, String message, Object payload){
        return  new CommonResult(code,message,payload);
    }
}
