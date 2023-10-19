package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcContr {
    @GetMapping
    public String wellcome(){
        return "Добро пожаловать";
    }
}
