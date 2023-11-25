package pro.sky.calculatorTwoVersion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculatorTwoVersion.Exception.ZeroTwoArgument;
import pro.sky.calculatorTwoVersion.service.CalculatorService;
import pro.sky.calculatorTwoVersion.service.CalculatorServiceImpl;

import java.util.List;
import java.util.stream.Stream;

public class ParamTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();
    @ParameterizedTest
    @MethodSource("argPlus")
    public void paramTestPlus(Integer first, Integer second, Integer answer) {
        String result = first + " + " + second + " = " + answer;
        Assertions.assertEquals(calculatorService.plus(first, second), result);
    }

    public static Stream<Arguments> argPlus() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(20, 0, 20),
                Arguments.of(222, 333, 555)
        );
    }

    @ParameterizedTest
    @MethodSource("argMinus")
    public void paramTestMinus(Integer first, Integer second, Integer answer) {
        String result = first + " - " + second + " = " + answer;
        Assertions.assertEquals(calculatorService.minus(first, second), result);
    }

    public static Stream<Arguments> argMinus() {
        return Stream.of(
                Arguments.of(2, 2, 0),
                Arguments.of(20, 0, 20),
                Arguments.of(222, 333, -111)
        );
    }

    @ParameterizedTest
    @MethodSource("argMultiply")
    public void paramTestMultiply(Integer first, Integer second, Integer answer) {
        String result = first + " * " + second + " = " + answer;
        Assertions.assertEquals(calculatorService.multiply(first, second), result);
    }

    public static Stream<Arguments> argMultiply() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(20, 0, 0),
                Arguments.of(25, 25, 625)
        );
    }

    @ParameterizedTest
    @MethodSource("argDivide")
    public void paramTestDivide(Integer first, Integer second, Integer answer) {
        String result = first + " / " + second + " = " + answer;
        Assertions.assertEquals(calculatorService.divide(first, second), result);
    }

    public static Stream<Arguments> argDivide() {
        return Stream.of(
                Arguments.of(2, 2, 1),
                Arguments.of(20, 3, 6),
                Arguments.of(222, 10, 22)
        );
    }
    @ParameterizedTest
    @MethodSource("argDivideEx")
    public void paramTestDivideException(Integer first, Integer second, Integer answer) {
        Assertions.assertThrows(ZeroTwoArgument.class,() ->{
            calculatorService.divide(first, second);
        });
    }
    public static Stream<Arguments> argDivideEx() {
        return Stream.of(
                Arguments.of(2, 0, null),
                Arguments.of(123456789, 0, null),
                Arguments.of(0, 0, null)
        );
    }
}
