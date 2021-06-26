package com.tionkior.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName : WebExceptionHandler
 * @Author : TionKior
 * @Date : 2021/6/26 9:13
 * @Version : V1.0
 * @Description : Unified exception handling class
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler
    public String handleException(Exception e){
        return e.getMessage();
    }

}
