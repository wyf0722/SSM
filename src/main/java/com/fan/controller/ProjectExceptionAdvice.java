package com.fan.controller;

import com.fan.exception.BusinessException;
import com.fan.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e) {
        System.out.println("we got system exception");
        return new Result(e.getCode(), null, e.getMessage());
    }
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e) {
        System.out.println("we got business exception");
        return new Result(e.getCode(), null, e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e) {
        System.out.println("we got exception");
        return new Result(Code.SYSTEM_UNKNOW_ERR, null, "系统繁忙，稍后重试！！！");
    }
}
