import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Класс для представления студента
class Student {
    private String fullName;
    private double averageScore;

    public Student(String fullName, double averageScore) {
        this.fullName = fullName;
        this.averageScore = averageScore;
    }

    public String getFullName() {
        return fullName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Студент: " + fullName + ", Средний балл: " + averageScore;
    }
}

// Исключение для обработки случаев, когда студент не найден
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

// Интерфейс для управления студентами
interface StudentManager {
    void addStudent(Student student);
    void sortStudentsByAverageScore();
    Student findStudentByFullName(String fullName) throws StudentNotFoundException;
    List<Student> getStudents();
}

// Реализация интерфейса
class StudentManagerImpl implements StudentManager {
    private List<Student> students;

    public StudentManagerImpl() {
        this.students = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void sortStudentsByAverageScore() {
        students.sort(Comparator.comparingDouble(Student::getAverageScore).reversed());
    }

    @Override
    public Student findStudentByFullName(String fullName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО '" + fullName + "' не найден.");
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }
}

// Основной класс с пользовательским интерфейсом
public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManagerImpl();

        while (true) {
            System.out.println("1. Добавить студента");
            System.out.println("2. Сортировать студентов по среднему баллу");
            System.out.println("3. Найти студента по ФИО");
            System.out.println("4. Вывести всех студентов");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Введите ФИО студента: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Введите средний балл студента: ");
                    double averageScore = scanner.nextDouble();
                    studentManager.addStudent(new Student(fullName, averageScore));
                    break;
                case 2:
                    studentManager.sortStudentsByAverageScore();
                    System.out.println("Студенты отсортированы по среднему баллу.");
                    break;
                case 3:
                    System.out.print("Введите ФИО студента для поиска: ");
                    String searchName = scanner.nextLine();
                    try {
                        Student foundStudent = studentManager.findStudentByFullName(searchName);
                        System.out.println(foundStudent);
                    } catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Список студентов:");
                    for (Student student : studentManager.getStudents()) {
                        System.out.println(student);
                    }
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
/*
1. **Класс `Student`**:
   - Хранит информацию о студенте: ФИО и средний балл.
   - Имеет методы для получения данных и переопределенный метод `toString()` для удобного вывода информации.

2. **Исключение `StudentNotFoundException`**:
   - Используется для обработки ситуации, когда студент с заданным ФИО не найден.

3. **Интерфейс `StudentManager`**:
   - Определяет методы для добавления студентов, сортировки, поиска и получения списка студентов.

4. **Класс `StudentManagerImpl`**:
   - Реализует интерфейс `StudentManager` и содержит логику для управления списком студентов.

5. **Класс `StudentManagementApp`**:
   - Содержит основной метод, реализующий пользовательский интерфейс с меню для взаимодействия с пользователем.
   - Позволяет добавлять студентов, сортировать их по среднему баллу, искать по ФИО и выводить список студентов.
*/