/*Анализ исключений
В программе Exception2 метод exceptionDemo запрашивает у пользователя 
ввод целого числа, а затем делит 2 на это число. 
Если запустить программу и ввести:
"Qwerty":
При попытке выполнить Integer.parseInt(intString) будет 
выброшено исключение NumberFormatException, так как строка "Qwerty" 
не может быть преобразована в целое число.
"0":
После преобразования строки "0" в целое число, при выполнении System.out.println(2/i) 
будет выброшено исключение ArithmeticException, так как деление на ноль невозможно.
"1.2":
При попытке выполнить Integer.parseInt(intString) будет выброшено 
исключение NumberFormatException, так как строка "1.2" не является целым числом.
Шаг 3: Изменение кода с добавлением блоков try-catch
*/

import java.util.Scanner;

public class Z2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не целое число.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль.");
        } finally {
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        Z2 example = new Z2();
        example.exceptionDemo();
    }
}
/*
Объяснение поведения программы
Обработка исключений:

В коде добавлен блок try, который содержит потенциально опасный код 
(преобразование строки в целое число и деление).
Если возникает NumberFormatException (например, при вводе "Qwerty" или "1.2"), 
программа перехватывает это исключение и выводит сообщение, что введено не целое число.
Если возникает ArithmeticException (например, при вводе "0"), 
программа перехватывает это исключение и выводит сообщение о делении на ноль.
Блок finally:

Блок finally гарантирует, что myScanner будет закрыт после выполнения блока 
try или catch, что позволяет избежать утечек ресурсов.
Таким образом, программа становится более устойчивой к ошибкам, 
и пользователю предоставляется понятная информация о том, что пошло не так.*/