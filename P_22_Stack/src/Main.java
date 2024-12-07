import java.util.Stack;

public class Main {

    // Метод для вычисления результата выражения в RPN
    public double evaluate(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    double subtrahend = stack.pop();
                    double minuend = stack.pop();
                    stack.push(minuend - subtrahend);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    double dividend = stack.pop();
                    if (divisor == 0) {
                        throw new ArithmeticException("Деление на ноль");
                    }
                    stack.push(dividend / divisor);
                    break;
                default:
                    // Если токен не оператор, предполагаем, что это число
                    stack.push(Double.parseDouble(token));
                    break;
            }
        }

        // Результат будет единственным элементом в стеке
        return stack.pop();
    }

    public static void main(String[] args) {
        Main calculator = new Main();

        String expression1 = "3 4 +"; // 3 + 4 = 7
        String expression2 = "10 2 8 * + 3 -"; // 10 + (2 * 8) - 3 = 10 + 16 - 3 = 23
        String expression3 = "5 1 2 + 4 * + 3 -"; // 5 + (1 + 2) * 4 - 3 = 14

        System.out.println("Результат выражения '" + expression1 + "': " + calculator.evaluate(expression1));
        System.out.println("Результат выражения '" + expression2 + "': " + calculator.evaluate(expression2));
        System.out.println("Результат выражения '" + expression3 + "': " + calculator.evaluate(expression3));
    }
}
