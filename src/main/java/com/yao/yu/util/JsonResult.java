package com.yao.yu.util;


import lombok.Data;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author yaozhan
 */
@Data
public class JsonResult<T> {

    private Integer state;
    private T data;
    private String message;

    public JsonResult() {
        super();
    }

    /**
     * 返回异常信息
     * @param e
     */
    public JsonResult(Throwable e){
        this.message=e.getMessage();
    }

    /**
     * 返回状态码和data响应数据类型
     * @param state
     * @param data
     */
    public JsonResult(Integer state, T data) {
        this.state = state;
        this.data = data;
    }

    public JsonResult(Integer state, String message) {
        this.state = state;
        this.message = message;
    }

    public JsonResult(Integer state) {
        this.state = state;
    }

//    @ExceptionHandler
//    public JsonResult<Void> handleException(Throwable ex) {
//        return JsonResult<Void>;
//    }
    //getter和setter方法。。。。

}
