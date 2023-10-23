package com.calculator.calculator.controller;

import com.calculator.calculator.servive.CalcOpers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalcContr {
    private final CalcOpers calcOpers;
    public CalcContr(CalcOpers calcOpers) {
        this.calcOpers = calcOpers;
    }
    @GetMapping
    public String wellcome() {
        return calcOpers.wellcome();
    }

    @GetMapping("/plus")
    public String plus(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2
    ) {
        return calcOpers.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2
    ) {
        return calcOpers.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2
    ) {
        return calcOpers.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2
    ) {
        return calcOpers.divide(num1, num2);
    }

}