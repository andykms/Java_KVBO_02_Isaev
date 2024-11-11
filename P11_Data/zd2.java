import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;


public class zd2 {
    private final SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    public void compareDates() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате дд-мм-гггг чч:мм:сс: ");
        String userInput = scanner.nextLine();
        scanner.close();

        long currentTimeMillis = System.currentTimeMillis();
        Date currentDate = new Date(currentTimeMillis);

        try {
            Date userDate = format.parse(userInput);
            if (currentDate.compareTo(userDate) > 0) {
                System.out.println("Текущая дата больше даты, введённой пользователем.");
            } else if (currentDate.compareTo(userDate) < 0) {
                System.out.println("Текущая дата меньше даты, введённой пользователем.");
            } else {
                System.out.println("Даты совпадают.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        zd2 tester = new zd2();
        tester.compareDates();
    }
}
