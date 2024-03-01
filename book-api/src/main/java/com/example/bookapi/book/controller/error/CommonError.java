package com.example.bookapi.book.controller.error;

/**
 * @Author zxl
 * @Date 2024/3/1 23:09
 * @Version 1.0
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
