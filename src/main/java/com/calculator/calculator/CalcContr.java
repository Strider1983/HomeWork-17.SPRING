package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcContr {
    private final CalcOpers calculation;
    public CalcContr(CalcOpers calculation) {
        this.calculation = calculation;
    }
    @GetMapping(path = "/calculator")
    public String wellcome() {
        return calculation.wellcome();
    }
}
