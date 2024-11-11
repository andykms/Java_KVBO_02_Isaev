import java.util.ArrayList;
import java.util.*;

public class Main9_3 {
    public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("Alice", 101));
    students.add(new Student("Bob", 104));
    students.add(new Student("Charlie", 102));
    students.add(new Student("David", 103));
    System.out.println("До сортировки:");
    for (Student student : students) {
        System.out.println(student.getIDNumber());
    }
    
    mergeSort(students, 0, students.size() - 1);

    System.out.println("\nПосле сортировки по id:");
    for (Student student : students) {
        System.out.println(student.getIDNumber());
    }
}

public static void mergeSort(ArrayList<Student> students, int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;
        mergeSort(students, left, mid);
        mergeSort(students, mid + 1, right);
        merge(students, left, mid, right);
    }
}

public static void merge(ArrayList<Student> students, int left, int mid, int right) {
    ArrayList<Student> temp = new ArrayList<>();
    int i = left;
    int j = mid + 1;
    while (i <= mid && j <= right) {
        if (students.get(i).getIDNumber() < students.get(j).getIDNumber()) {
            temp.add(students.get(i));
            i++;
        } else {
            temp.add(students.get(j));
            j++;
        }
    }
    while (i <= mid) {
        temp.add(students.get(i));
        i++;
    }
    while (j <= right) {
        temp.add(students.get(j));
        j++;
    }
    for (int k = left; k <= right; k++) {
        students.set(k, temp.get(k - left));
    }
}
}