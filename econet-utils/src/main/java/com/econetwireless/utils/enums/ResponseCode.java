package com.econetwireless.utils.enums;

/**
 * Created by tnyamakura on 17/3/2017.
 */
public enum ResponseCode {

    SUCCESS("200"), FAILED("500"), INVALID_REQUEST("400");
    private String code;
    ResponseCode(String code) {
        this.code = code;
        //removed code to replace with this
    }

    public String getCode() {
        return code;
    }
}
