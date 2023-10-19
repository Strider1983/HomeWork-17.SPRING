package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcContr {
    @GetMapping(path = "/calculator")
    public String wellcome(){
        return "Добро пожаловать";
    }
    public int num1;
    public int num2;
    @GetMapping(path = "/calculator/plus")
    public int plus(int num1, int num2) {
         return num1+num2;
    }
}
