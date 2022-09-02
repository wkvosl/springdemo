package com.acompany.springdemo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//전역예외처리기
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    //예외가 발생되면 여기로 모인다.
    @ExceptionHandler(value = Exception.class)
    public Map<String, String> handleException(Exception e){
        Map<String, String> res = new HashMap<>();
        res.put("errorMsg",e.getMessage());
        res.put("status","error");
        return  res;
    }

    //수학 예외
    //모든 에러를 잡는 Exception보다 위에 있어야 작동됨~
    @ExceptionHandler(value = ArithmeticException.class)
    public Map<String , String > handleArithMathicExcepion(ArithmeticException e){
        Map<String, String> res = new HashMap<>();
        res.put("errorMsg",e.getMessage());
        res.put("status","error");
        return  res;
    }

}
