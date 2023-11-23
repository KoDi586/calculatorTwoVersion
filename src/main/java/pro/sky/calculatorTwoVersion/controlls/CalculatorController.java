package pro.sky.calculatorTwoVersion.controlls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculatorTwoVersion.service.CalculatorService;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    private String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    private String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    private String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    private String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.multiply(num1, num2);
    }
}
