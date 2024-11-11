import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentBirth {
  public static void main(String[] args) {
    Date birthDate = new Date(103, 10, 10); // Пример даты рождения
    Student student = new Student("Иванов", birthDate);
    System.out.println(student);
    System.out.println("Дата рождения в коротком формате: " + student.getBirthDateFormatted("dd.MM.yy"));
    System.out.println("Дата рождения в среднем формате: " + student.getBirthDateFormatted("dd MMMM yyyy"));
    System.out.println("Дата рождения в полном формате: " + student.getBirthDateFormatted("dd MMMM yyyy EEEE"));
}
}