package pro.sky.calculatorTwoVersion.service;

import org.springframework.stereotype.Service;
import pro.sky.calculatorTwoVersion.Exception.ZeroTwoArgument;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String plus(Integer num1, Integer num2) {
        return num1 + " + " + num2 + " = " + (num1+num2);
    }

    public String minus(Integer num1, Integer num2) {
        return num1 + " - " + num2 + " = " + (num1-num2);
    }

    public String multiply(Integer num1, Integer num2) {
        return num1 + " * " + num2 + " = " + (num1*num2);
    }

    public String divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new ZeroTwoArgument();
        }
        return num1 + " / " + num2 + " = " + (num1/num2);
    }



}
