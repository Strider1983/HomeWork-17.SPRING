package com.calculator.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculations implements CalcOpers{
    public String wellcome() {
        return "Добро пожаловать";
    }
}
