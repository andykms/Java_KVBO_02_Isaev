import java.util.Arrays;

// Класс для узла односвязного списка
class Node11 {
    int[] values; // Массив из 5 целых чисел
    int count;    // Количество заполненных значений
    Node11 next;    // Указатель на следующий узел

    public Node11() {
        this.values = new int[5]; // Инициализация массива
        this.count = 0;            // Изначально массив пуст
        this.next = null;          // Указатель на следующий узел
    }
}

        // Класс для односвязного списка
        class LinkedList {
            private Node11 head; // Голова списка

            public LinkedList() {
                this.head = null; // Изначально список пуст
            }

            // Метод для добавления значения в список с сохранением упорядоченности
            public void add(int value) {
                if (head == null) {
                    // Если список пуст, создаем новый узел
                    head = new Node11();
                    head.values[0] = value; // Добавляем значение в массив
                    head.count++;
                    return;
                }

                Node11 current = head;
                while (current != null) {
                    if (current.count < 5) {
                        // Если массив не заполнен, добавляем значение
                        insertInOrder(current, value);
                        return;
                    }
                    if (current.next == null) {
                        // Если текущий узел заполнен и это последний узел, создаем новый
                        current.next = new Node11();
                        insertInOrder(current.next, value);
                        return;
                    }
                    current = current.next; // Переход к следующему узлу
                }
            }

            // Метод для вставки значения в массив в порядке возрастания
            private void insertInOrder(Node11 node, int value) {
                int i;
                // Найти позицию для вставки
                for (i = 0; i < node.count; i++) {
                    if (node.values[i] > value) {
                        break;
                    }
                }
                // Сдвинуть элементы вправо
                for (int j = node.count; j > i; j--) {
                    node.values[j] = node.values[j - 1];
                }
                // Вставить новое значение
                node.values[i] = value;
                node.count++;
            }

            // Метод для вывода списка
            public void printList() {
                Node11 current = head;
                while (current != null) {
                    System.out.println(Arrays.toString(Arrays.copyOf(current.values, current.count)));
                    current = current.next;
                }
            }
        }

        // Пример использования
        public class Main11 {
            public static void main(String[] args) {
                LinkedList list = new LinkedList();
                list.add(3);
                list.add(1);
                list.add(4);
                list.add(5);
                list.add(2);
                list.add(6);
                list.add(7);
                list.add(8);
                list.add(9);
                list.add(10); // Добавление, которое вызовет создание нового узла

                System.out.println("Содержимое списка:");
                list.printList();
            }
        }