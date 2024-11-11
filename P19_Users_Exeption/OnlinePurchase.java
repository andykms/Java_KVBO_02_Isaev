import java.util.Scanner;

class InvalidTaxNumberException extends Exception {
    public InvalidTaxNumberException(String message) {
        super(message);
    }
}

public class OnlinePurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите номер ИНН (10 или 12 цифр): ");
            String taxNumber = scanner.nextLine();

            // Проверяем ИНН
            validateTaxNumber(taxNumber);

            System.out.println("Заказ успешно оформлен на имя: " + fullName);
        } catch (InvalidTaxNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void validateTaxNumber(String taxNumber) throws InvalidTaxNumberException {
        // Проверяем, что ИНН состоит из 10 или 12 цифр
        if (!taxNumber.matches("\\d{10}") && !taxNumber.matches("\\d{12}")) {
            throw new InvalidTaxNumberException("ИНН должен состоять из 10 или 12 цифр.");
        }

        // Дополнительные проверки можно добавить здесь (например, контрольная сумма и т.д.)
    }
}
/*
1. **Исключение**: 
   - Создаем собственное исключение `InvalidTaxNumberException`, которое расширяет класс `Exception`. Это исключение будет выбрасываться, если введенный ИНН недействителен.

2. **Основной класс**: 
   - В классе `OnlinePurchase` используем `Scanner` для получения ввода от пользователя.
   - Пользователь вводит свое ФИО и номер ИНН.

3. **Проверка ИНН**:
   - Метод `validateTaxNumber` проверяет, состоит ли введенный ИНН из 10 или 12 цифр с помощью регулярного выражения. Если ИНН не соответствует этим требованиям, выбрасывается исключение `InvalidTaxNumberException`.

4. **Обработка исключений**:
   - В основном методе мы обрабатываем исключение с помощью блока `try-catch`. Если пользователь вводит недействительный ИНН, программа выводит сообщение об ошибке.

5. **Закрытие ресурса**:
   - В блоке `finally` мы закрываем `Scanner`, чтобы избежать утечек ресурсов.

*/