package com.imooc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 统一异常
 */
@ControllerAdvice
public class GobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String errorHandler(Model model,Exception e){
        model.addAttribute("error",e.getMessage());
        return "err";
    }
}
