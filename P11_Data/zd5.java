import java.lang.management.ManagementFactory;
import java.lang.management.Stopwatch;
import java.util.*;

import java.util.concurrent.TimeUnit;

class zd5 {
    public static void main(String[] args) {
        // Создаем объекты для тестирования
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Заполняем массивы случайными данными
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime = System.currentTimeMillis();

        // Выполняем операции над ArrayList
        System.out.println("ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            int value = arrayList.get(i);
            if (value % 2 == 0) {
                arrayList.remove(i);
                i--;
            }
        }
        long endTime = System.currentTimeMillis();
        long timeArrayList = endTime - startTime;

        // Выводим результаты
        System.out.printf("Время выполнения ArrayList: %d мс\n", timeArrayList);

        // Очищаем массивы
        arrayList.clear();
        linkedList.clear();

        // Повторяем операции над LinkedList
        System.out.println("LinkedList:");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            int value = linkedList.get(i);
            if (value % 2 == 0) {
                linkedList.remove(i);
                i--;
            }
        }
        endTime = System.currentTimeMillis();
        timeArrayList = endTime - startTime;
        
        // Выводим результаты
        System.out.printf("Время выполнения LinkedList: %d мс\n", timeArrayList);
    }
}
