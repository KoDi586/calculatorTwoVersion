package pro.sky.calculatorTwoVersion.Exception;

public class ZeroTwoArgument extends IllegalArgumentException {
    public ZeroTwoArgument() {
        super("Делить на ноль нельзя!");
    }
}
