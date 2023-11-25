package pro.sky.calculatorTwoVersion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculatorTwoVersion.Exception.ZeroTwoArgument;
import pro.sky.calculatorTwoVersion.service.CalculatorService;
import pro.sky.calculatorTwoVersion.service.CalculatorServiceImpl;

public class CalculatorTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void checkPlusOnTrueAnswer() {
        String result85 = calculatorService.plus(55, 30);
        String answer = "55 + 30 = 85";
        Assertions.assertEquals(result85,answer);
    }

    @Test
    public void checkPlusWithNull() {
        String result = calculatorService.plus(55, 0);
        String answer = "55 + 0 = 55";
        Assertions.assertEquals(result,answer);
    }

    @Test
    public void checkMinusOnTrueAnswer() {
        String result25 = calculatorService.minus(55, 30);
        String answer = "55 - 30 = 25";
        Assertions.assertEquals(result25,answer);
    }
    @Test
    public void checkMinusWithNull() {
        String result = calculatorService.minus(55, 0);
        String answer = "55 - 0 = 55";
        Assertions.assertEquals(result,answer);
    }
    @Test
    public void checkMultiplyOnTrueAnswer() {
        String result625 = calculatorService.multiply(25, 25);
        String answer = "25 * 25 = 625";
        Assertions.assertEquals(result625,answer);
    }

    @Test
    public void checkMultiplyWithNull() {
        String result = calculatorService.multiply(55, 0);
        String answer = "55 * 0 = 0";
        Assertions.assertEquals(result,answer);
    }

    @Test
    public void checkDivideOnTrueAnswer() {
        String result25 = calculatorService.divide(625, 25);
        String answer = "625 / 25 = 25";
        Assertions.assertEquals(result25, answer);
    }

    @Test
    public void checkDivideOnTrueAnswerTwo() {
        String result25 = calculatorService.divide(37, 25);
        String answer = "37 / 25 = 1";
        Assertions.assertEquals(result25, answer);
    }
    @Test
    public void checkDivideWithNull() {
        Assertions.assertThrows(ZeroTwoArgument.class,() ->{
            calculatorService.divide(625, 0);
                });
    }
}
