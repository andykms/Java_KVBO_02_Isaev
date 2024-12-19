// Класс для узла двусвязного списка

//ЗАДАНИЕ 2 - Сортировка двусвязного списка путем
// исключения элемента с минимальным значением
// включением его в начало списка

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// Класс для двусвязного списка
class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    // Метод для добавления элемента в конец списка
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Метод для сортировки списка
    public void sort() {
        if (head == null) {
            return; // Пустой список
        }

        DoublyLinkedList sortedList = new DoublyLinkedList();

        while (head != null) {
            Node minNode = findMinNode();
            removeNode(minNode);
            sortedList.add(minNode.data);
        }

        // Переносим отсортированный список обратно в текущий
        this.head = sortedList.head;
    }

    // Метод для нахождения узла с минимальным значением
    private Node findMinNode() {
        Node current = head;
        Node minNode = head;

        while (current != null) {
            if (current.data < minNode.data) {
                minNode = current;
            }
            current = current.next;
        }
        return minNode;
    }

    // Метод для удаления узла из списка
    private void removeNode(Node node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next; // Если удаляемый узел - голова
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        }
    }

    // Метод для печати списка
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);

        System.out.println("Исходный список:");
        list.printList();

        list.sort();

        System.out.println("Отсортированный список:");
        list.printList();
    }
}
