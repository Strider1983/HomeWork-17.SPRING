package com.calculator.calculator;

import com.calculator.calculator.servive.CalcOpers;
import org.springframework.stereotype.Service;
@Service
public class CalculationsImpl implements CalcOpers {

    @Override
    public String wellcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int num1, int num2) {return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
