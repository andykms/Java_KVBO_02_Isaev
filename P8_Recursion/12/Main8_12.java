import java.util.Scanner;

public class Main8_12 {
    public static void main(String[] args) {
        printOddNumbers();
    }

    public static void printOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Проверка условия завершения
        if (number != 0) {
            // Рекурсивный вызов для следующего числа
            printOddNumbers();

            // Проверка, является ли текущее число нечетным
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}