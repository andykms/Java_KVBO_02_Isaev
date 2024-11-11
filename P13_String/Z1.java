import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        // 1. Метод принимает любую строку
        processString(inputString);
    }

    private static void processString(String string) {
        // 2. Распечатать последний символ строки
        char lastChar = string.charAt(string.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        // 3. Проверить, заканчивается ли строка подстрокой "!!!"
        if (string.endsWith("!!!")) {
            System.out.println("Строка заканчивается на '!!!'.");
        } else {
            System.out.println("Строка не заканчивается на '!!!'.");
        }

        // 4. Проверить, начинается ли строка подстрокой "I like"
        if (string.startsWith("I like")) {
            System.out.println("Строка начинается на 'I like'.");
        } else {
            System.out.println("Строка не начинается на 'I like'.");
        }

        // 5. Проверить, содержит ли строка подстроку "Java"
        if (string.contains("Java")) {
            System.out.println("Строка содержит 'Java'.");
        } else {
            System.out.println("Строка не содержит 'Java'.");
        }

        // 6. Найти позицию подстроки "Java" в строке
        int index = string.indexOf("Java");
        if (index != -1) {
            System.out.println("Позиция подстроки 'Java': " + index);
        } else {
            System.out.println("Подстрока 'Java' не найдена.");
        }

        // 7. Заменить все символы "а" на "о"
        string = string.replace('а', 'о');
        System.out.println("После замены 'а' на 'о': " + string);

        // 8. Преобразовать строку к верхнему регистру
        string = string.toUpperCase();
        System.out.println("В верхнем регистре: " + string);

        // 9. Преобразовать строку к нижнему регистру
        string = string.toLowerCase();
        System.out.println("В нижнем регистре: " + string);

        // 10. Вырезать строку Java с помощью метода String.substring()
        String javaSubstring = string.substring(7);
        System.out.println("Вырезанная строка Java: " + javaSubstring);
    }
}