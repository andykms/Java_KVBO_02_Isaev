public class CalculatorModel {
    private double currentResult;
    private String operator;
    private double lastOperand;

    public CalculatorModel() {
        currentResult = 0;
        operator = "";
        lastOperand = 0;
    }

    public void setOperand(double operand) {
        lastOperand = operand;
    }

    public void setOperator(String operator) {
        if (!this.operator.isEmpty()) {
            calculate();
        }
        this.operator = operator;
        currentResult = lastOperand;
    }

    public double calculate() {
        switch (operator) {
            case "+":
                currentResult += lastOperand;
                break;
            case "-":
                currentResult -= lastOperand;
                break;
            case "*":
                currentResult *= lastOperand;
                break;
            case "/":
                if (lastOperand == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                currentResult /= lastOperand;
                break;
            default:
                currentResult = lastOperand;
                break;
        }
        return currentResult;
    }

    public double getResult() {
        return currentResult;
    }

    public void clear() {
        currentResult = 0;
        operator = "";
        lastOperand = 0;
    }
}
