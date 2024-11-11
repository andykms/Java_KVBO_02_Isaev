import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA {
    private List<Student> students;


    // Метод для заполнения массива
    public void setArray(List<Student> students) {
        this.students = students;
    }

    // Быстрая сортировка по среднему баллу студентов
    public void quicksort() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getGpa() > s2.getGpa()) {
                    return -1;
                } else if (s1.getGpa() < s2.getGpa()) {
                    return 1;
                }
                return 0;
            }
        });
    }

    // Сортировка слиянием
    public void mergeSort() {
        List<Student> sortedStudents = new ArrayList<>(students);
        mergeSort(sortedStudents, 0, sortedStudents.size());
    }

    private void mergeSort(List<Student> list, int start, int end) {
        if (start + 1 < end) {
            int middle = (start + end) / 2;
            mergeSort(list, start, middle);
            mergeSort(list, middle, end);
            merge(list, start, middle, end);
        }
    }

    private void merge(List<Student> list, int left, int mid, int right) {
        int i = left;
        int j = mid;
        while (i < mid && j < right) {
            if (list.get(i).getGpa() <= list.get(j).getGpa()) {
                i++;
            } else {
                Collections.swap(list, i, j);
                i++;
                j++;
            }
        }
        while (i < mid) {
            i++;
        }
        for (int k = left; k < right; k++) {
            list.set(k, list.get(left));
        }
    }

    // Вывод массива студентов
    public void outArray() {
        System.out.println("Список студентов:");
        for (Student student : students) {
            System.out.printf("%s %s %f\n", student.getFirstName(), student.getLastName(), student.getGpa());
        }
    }

    // Возможность сортировать список студентов по другому полю
    public void sortByAnotherField(Comparator<Student> comparator) {
        Collections.sort(students, comparator);
    }
}