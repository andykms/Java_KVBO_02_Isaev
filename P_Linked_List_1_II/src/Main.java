import java.util.*;

public class Main {
    public static void main(String[] args) {
        __LinkedList Arr1 = new __LinkedList();
        menu(Arr1);
    }
    public static void menu(__LinkedList __list) {
        System.out.println("Для добавления введите 1, удаления 2, просмотра массива 3, просмотра элемента по индексу 4, очистки 5, проверки на пустоту 6, для выхода 7");
        Scanner sc = new Scanner(System.in);
        int function = sc.nextInt();
        switch (function) {
            case 1:
                __list.append();
                menu(__list);
                break;
            case 2:
                System.out.println("Введите индекс удаления");
                int ind = sc.nextInt();
                __list.pop(ind);
                menu(__list);
                break;
            case 3:
                __list.print();
                menu(__list);
                break;
            case 4:
                System.out.println("Введите индекс элемента");
                int ind2 = sc.nextInt();
                __list.print(ind2);
                menu(__list);
                break;
            case 5:
                __list.clear();
                menu(__list);
                break;
            case 6:
                __list.is_empty();
                menu(__list);
                break;
            case 7:
                return;
            default:
                menu(__list);
                break;
        }
    }
}