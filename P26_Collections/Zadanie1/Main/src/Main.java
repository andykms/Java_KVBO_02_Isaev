import java.util.Stack;

public class Main {

    public static void invertArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        // Помещаем все элементы массива в стек
        for (int num : array) {
            stack.push(num);
        }

        // Извлекаем элементы из стека и записываем обратно в массив
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Исходный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        invertArray(array);

        System.out.println("\nИнвертированный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

