import java.util.Arrays;
import java.util.Random;


public class Main9_1 {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("", random.nextInt(100));
            // Заполнение данных о студенте
        }

        System.out.println("Исходный массив:");
        printStudents(students);

        insertionSort(students); // Сортировка массива вставками

        System.out.println("\nОтсортированный массив:");
        printStudents(students);
    }

    private static void insertionSort(Student[] array) {
        for (int i = 1; i < array.length; i++) {
            Student temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1].getIDNumber() > temp.getIDNumber()) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }

    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.printf("%s %d\n", student.getName(), student.getIDNumber());
        }
    }
}