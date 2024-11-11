import java.util.Date;

public class TaskInfo {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Фамилия разработчика: Иванов");
        System.out.println("Дата и время получения задания: " + currentDate);

        // Считаем, что задание сдано через 3 дня
        long threeDaysInMillis = 3 * 24 * 60 * 60 * 1000;
        Date dueDate = new Date(currentDate.getTime() + threeDaysInMillis);
        System.out.println("Дата и время сдачи задания: " + dueDate);
    }
}