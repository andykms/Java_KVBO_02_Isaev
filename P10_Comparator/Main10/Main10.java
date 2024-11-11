import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

public class Main10 {
    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", "Computer Science", 1, "Group A", 4.67));
        students.add(new Student("Jane", "Smith", "Mathematics", 1, "Group B", 3.89));
        students.add(new Student("Alina", "Ivanova", "Ingeenering", 1, "Group A2-B2", 3.23));
        sorter.setArray(students);
        sorter.quicksort();
        sorter.outArray();
    }
}